package 수업.조합;

import java.util.Scanner;

public class 순열 {

    static int N;   // 재료 수  
    static int R;   // 뽑을 수
    //static String[] selected;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        R = sc.nextInt();
        sc.nextLine();
        
        String[] ingredient = new String[N];
        
        for (int i = 0; i < N; i++) {
            ingredient[i] = sc.next();
        }
        
        //System.out.println(Arrays.toString(ingredient));

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                for(int k=j; k<N; k++){
                    System.out.println(ingredient[i] + " " + ingredient[j] + " " + ingredient[k]);
                }
            }
        }

    }
}
