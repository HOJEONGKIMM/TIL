import requests
import json
import os
from PIL import Image
from io import BytesIO


# Configs
WARNING = True

## JSESSIONID_HAKSAF cookie value
SESSION_ID = "1nSHif16QhjxGWmpTjpy39V-ag5yPB0NG20c2-ni7TBJEpf7G1iM!1513562103!778526643!1741735722362"
## Document ID on url (https://edu.ssafy.com/edu/learn/ebook/unzip/...)
DOC_ID = "A2025030517565441300"
## PDF Output file name
OUTPUT_NAME = DOC_ID
## If you also want img files for each page, set this to True
GENERATE_IMAGES = False


def print_warning():
    if WARNING:
        print("이 프로그램을 사용해서 발생하는 모든 문제는 사용자에게 있습니다.")
        print("다운받은 PDF 파일을 무단으로 배포하는 행위는 하지 않았으면 좋겠네요.")


def create_session(session_id: str) -> requests.Session:
    session = requests.Session()
    cookies = {"JSESSIONID_HAKSAF": session_id}
    session.cookies.update(cookies)
    return session


def request_pages_info(session: requests.Session, doc_id: str) -> list:
    doc_url = f"https://edu.ssafy.com/data/upload_files/crossUpload/openLrn/ebook/unzip/{doc_id}/project.json"

    response = session.get(doc_url)
    response.raise_for_status()
    data = json.loads(response.text)

    return data["pages"]


def load_images(pages: list) -> list[Image.Image]:
    images = []
    base_url = f"https://edu.ssafy.com/data/upload_files/crossUpload/openLrn/ebook/unzip/{DOC_ID}/assets/page-images/"

    for i, page in enumerate(pages, start=1):
        # inplace count
        print(f"\rDownloading page {i}/{len(pages)}", end="", flush=True)
        image_url = base_url + page["background"]["url"].split("/")[-1]
        response = session.get(image_url)
        img = Image.open(BytesIO(response.content))
        images.append(img)

    print()  # newline
    return images


def save_pdf(images: list[Image.Image]):
    if images:
        print("Saving PDF...")
        images[0].save(f"{OUTPUT_NAME}.pdf", save_all=True, append_images=images[1:])
        print(f"PDF saved as {OUTPUT_NAME}.pdf")


def save_images(images: list[Image.Image]):
    if images:
        dir_name = OUTPUT_NAME + "_Images"
        os.makedirs(dir_name, exist_ok=True)
        print("Saving images...")
        for i, img in enumerate(images, start=1):
            # inplace count
            print(f"\rSaving image {i}/{len(images)}", end="", flush=True)
            img.save(f"{dir_name}/{OUTPUT_NAME}_page{i}.png")
        print()  # newline
        print(f"{len(images)} Images saved in {dir_name}/")


if __name__ == "__main__":
    print_warning()

    try:
        session = create_session(SESSION_ID)
        pages = request_pages_info(session, DOC_ID)

        images = load_images(pages)

        if GENERATE_IMAGES:
            save_images(images)

        save_pdf(images)
    except requests.RequestException as e:
        print(e)
        print(f"Check your document ID: {DOC_ID}")
    except json.JSONDecodeError as e:
        print(e)
        print(f"Check your document ID: {DOC_ID}")
        print("or perhaps your session ID is invalid")
    except Exception as e:
        print(e)
        print("Something went wrong")
