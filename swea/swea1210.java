package swea;

import java.util.Scanner;

public class swea1210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[100][100];


        // j가 100 되면 종료
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // 먼저 2가 있는 위치 찾아야 됨
        // j는 100번째줄 -> 제일 마지막 줄!
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i][99] != 2){
                start ++;
            }else{
                break;
            }
        }

        int cnt = 0;                                    // 몇 번 위로 올라갔는지 count
        
        for(int i=arr.length-1;i>=0;i--){               // arr.length로 시작하면 인덱스 범위 초과
            for(int j=arr.length-1;j>=0;j--){
                if(arr[i][j-1]==1){
                  continue;  
                }else{ // 0인 경우
                    if(i>0) i--;
                    cnt++;
                }
            }
        }


    }
}
