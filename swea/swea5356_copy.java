package swea;

import java.util.Scanner;

public class swea5356_copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T =  sc.nextInt();

        for(int t = 1; t <= T; t++){
            char[][] arr2 = new char[5][];

            for(int i=0; i<5; i++){
                for(int j=0; j<arr2.length; j++){
                    String word = sc.nextLine();
                    arr2[i] = word.toCharArray();
                }
            }


            for(int i=0; i<5; i++){
                for(int j=0; j<arr2[j].length; j++){
                    System.out.println(arr2[j][i]);
                }
            }

        }
    }
}
