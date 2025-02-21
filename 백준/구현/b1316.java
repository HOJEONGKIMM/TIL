package 백준.구현;

import java.util.Scanner;

public class b1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int cnt = 0;
        for(int i=0; i < N; i++){
            String word = sc.nextLine();
            int len = word.length();

            if(len == 1) {
                cnt = 1;
                break;
            }
            for(int a = 0; a<len; a++){
                // 전체 단어 하나하나 확인하기
                for(int b = 1; b<len; b++){
                    if(word.charAt(a) != word.charAt(b)) continue;
                    else {
                        if(word.charAt(b) == word.charAt(b-1)) break;
                    }

                }

            }

        }
        
    }
}
