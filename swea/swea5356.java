package swea;

import java.util.Scanner;

public class swea5356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for(int t=1; t<=T; t++){
            String[] arr= new String[5];

            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextLine();
            }

            int maxLen = Integer.MIN_VALUE;
            int len = 0;
            for(int i=0; i<arr.length; i++){
                len = arr[i].length();
                maxLen = Math.max(maxLen, len);
            }
            int size = arr.length;
            StringBuilder sb = new StringBuilder(); 
            for(int i=0; i<maxLen; i++){
                for(int j=0; j<size; j++){
                    sb.append(arr[j].charAt(i));
                    //System.out.print(arr[j].charAt(i));
                }
            }
            System.out.println("#" + t + " " + sb);
         }
    }
}
