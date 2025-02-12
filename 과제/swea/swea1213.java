package 과제.swea;

import java.util.Scanner;

public class swea1213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        String pattern = sc.next();
        String text = sc.next();
        System.out.println(Matching(text, pattern));
        
        sc.close();
    }

    static int Matching(String t, String p){

        int N = t.length();
        int M = p.length();
        int cnt = 0;

        for(int i=0;i<=N-M;i++){
            boolean isOk = true;
            for(int j = 0;j<M;j++){
                if(t.charAt(i+j) != p.charAt(j)){
                    isOk = false;
                    break;
                }
            }
            if(isOk==true) cnt++;
        }

        return cnt;
    }
}
