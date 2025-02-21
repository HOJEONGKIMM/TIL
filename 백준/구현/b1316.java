package 백준.구현;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class b1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        
        int cnt = 0;
        for(int i=0; i < N; i++){
            String word = sc.nextLine();
            int len = word.length();

            Set<Character> set = new HashSet<>();
            Character prev = '';

            for(int a = 0; a<len; a++){
                // 이전 문자랑 다르면 

                // 근데 set에 있어서 이미 나온 문자면 cnt ++;

                // or 새롭게 등장한 문자 추가

                // prev 갱신
            }

        }

        System.out.println(cnt);
        
    }
}
