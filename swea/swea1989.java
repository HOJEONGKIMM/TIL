package swea;

import java.util.Scanner;

public class swea1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        sc.next();
        
        for(int T = 1;T<=a;T++){
            String n = sc.next();

            StringBuilder sb = new StringBuilder();
            sb.append(n);
            
            if(sb.reverse().toString().equals(n)){
                System.out.println("#" + T+ " "+ 1);
            }else{
                System.out.println("#" + T+ " "+0);
            }


        }

        sc.close();
    }
}
