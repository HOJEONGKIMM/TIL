
public class 부분집합02_비트마스킹 {
	static String[] ingre = { "단무지", "햄", "오이", "계란" };
	static int N = 4;

	public static void main(String[] args) {
	
		for (int i = 0; i < (1 << N); i++) {
			System.out.print("김밥 - ");

			for (int j = 0; j < N; j++) {
				// 재료  하나씩 쉬프트하면서 검사할건데 1인지로 체크하면 안 됨
				if((i & (1<<j)) !=0) {
					// 해당 코드가 실행이 된다면 재료 있는거
					System.out.print(ingre[j] +" ");
				}
			} // 재료 체크
			System.out.println();
		} // 모든 김밥 경우의 수
	}
}
