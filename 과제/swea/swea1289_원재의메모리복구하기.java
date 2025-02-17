package 과제.swea;

import java.util.Scanner;

public class swea1289_원재의메모리복구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=1; t<=T; t++){

            String bits = sc.nextLine();
            String[] bitsArr = new String[bits.length()];
            
            for(int i=0; i<bits.length(); i++){
                bitsArr[i] = String.valueOf(bits.charAt(i));
            }

            // 조건 : 모든 비트가 0
            int cnt = 1;        // 고친 횟수 저장
            for(int i=0; i<bits.length(); i++){
                if(!bitsArr[i].equals("0")){    // 0이 아닌 값을 찾으면
                    cnt++;
                    for(int j=i; j<bits.length(); j++){
                        if(!bitsArr[j].equals("0")) bitsArr[j] = "1";
                        else bitsArr[j] = "0";
                    }
                }else{
                    break;
                }
            }

            System.out.println("#" + t + " " +cnt);
        }
    }
}
