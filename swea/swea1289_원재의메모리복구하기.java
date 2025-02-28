package swea;

import java.util.Scanner;

public class swea1289_원재의메모리복구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){

            String bits = sc.nextLine();
            String[] bitsArr = bits.split("");

            // 조건 : 모든 비트가 0
            int cnt = 0;        // 고친 횟수 저장
            boolean flip = false;   // 이미 반전했는지 체크
            for(int i=0; i<bits.length(); i++){
                if(!bitsArr[i].equals("0") && !flip){    // 0이 아닌 값을 찾으면
                    cnt++;
                    for(int j=i; j<bits.length(); j++){
                        if(!bitsArr[j].equals("0")) bitsArr[j] = "1";
                        else bitsArr[j] = "0";
                    }
                } // 그냥 else{break} 쓰면 앞자리가 0이기만 해도 바로 퇴출
                    
            }

            System.out.println("#" + t + " " +cnt);
        }
        sc.close();
    }
}
