package swea;

import java.util.Scanner;

public class swea22979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int t = 1; t<=T; t++){
            StringBuilder sb = new StringBuilder();
            sb.append(sc.nextLine());

            int N = sc.nextInt();
            int[] arr = new int[N];

            for(int i=0; i<N; i++){
                arr[i] = sc.nextInt();    
            }
            sc.nextLine();  // 개행문자 제거!!!!!!!!!!!!!!!!!!!!!!!!!

            for(int i=0; i<N; i++){
                if(arr[i] > 0){
                    // 따로 삭제한 부분 변수에 저장
                    // delete하고
                    // 변수 부분 append
                    if(arr[i] < sb.length()){
                        String deleted = sb.substring(0, arr[i]);
                        sb.delete(0, arr[i]);
                        sb.append(deleted);
                    }
                }else if(arr[i] < 0){
                    int lengthDeleted = -arr[i];
                    
                    if(-arr[i] < sb.length()){
                        String deleted = sb.substring(sb.length() + arr[i]);
                        sb.delete(sb.length() + arr[i], sb.length());
                        sb.insert(0,deleted);
                    }
                }else{
                    continue;
                }
            }

            System.out.println("#" + t + " " + sb.toString());
        }
    }
}
