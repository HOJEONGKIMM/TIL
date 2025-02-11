package 과제.swea;

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

        for(int i=arr.length;i>0;i--){
            for(int j=arr.length;j>0;j--){
                if(arr[i][j-1]==1){
                    
                } 
            }
        }


    }
}
