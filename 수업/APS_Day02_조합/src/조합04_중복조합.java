import java.util.ArrayList;
import java.util.List;

public class 조합04_중복조합 {
	static String[] 재료; // data
	static int N, R; // 전체 재료 수 N, 뽑을 재료의 수 R

	static List<List<String>> result;

	public static void main(String[] args) {
		N = 4;
		R = 2;
		재료 = new String[] { "상추", "패티", "토마토", "치즈" };

		result = new ArrayList<>();
		
		combRepet(0, new ArrayList<String>());
		
		for(List<String> tmp : result) {
			System.out.println(tmp);
		}
	}

	// current : 임시 리스트 / 배열로 처리, 인덱스 필요할지도
	public static void combRepet(int start, List<String> current) {
		// 종료 조건
		if (current.size() == R) {
			//System.out.println(current);
			result.add(new ArrayList<>(current));
			
			return;
		}

		// 재귀 조건
		for(int i=start; i<N; i++) {
			current.add(재료[i]);		// 재료 넣기
			combRepet(i, current);	// 중복 허용이니 i를 다시 고려하도록
			current.remove(current.size()-1);	// 재료 빼기
			
		}
	}

}
