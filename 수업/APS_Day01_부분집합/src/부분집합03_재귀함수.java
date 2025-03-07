import java.util.Scanner;

public class 부분집합03_재귀함수 {
	static String[] ingre = { "단무지", "햄", "오이", "계란" };
	static int N = 4;
	static boolean[] sel = new boolean[N];

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		powerset(0);
	}

	// N은 static 선언
	// idx는 이번에 판단할 재료
	public static void powerset(int idx) {
		// 종료 조건 : 재료를 전부 고려했을 때 
		if(idx == N) {
			String tmp = "김밥 : ";
			for(int i=0; i<N; i++) {
				if(sel[i]) {
					tmp += ingre[i];
				}
			}
			System.out.println(tmp);
			return;
		}
		

		// 재귀 조건
		sel[idx] = false; // idx 자리의 재료를 넣지 않겠다
		powerset(idx + 1); // 다음 재료로

		sel[idx] = true; // idx 자리의 자료를 넣겠다
		powerset(idx + 1); // 다음 재료로


	}

}
