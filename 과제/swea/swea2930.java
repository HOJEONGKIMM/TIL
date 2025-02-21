package 과제.swea;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class swea2930 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
    
        for(int t=1; t<=T; t++){

            int N = sc.nextInt();
        

            // 최소힙
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for(int i=0; i<N; i++){
                String line = sc.nextLine();
                String[] num = line.split(" ");

                if(num[0].equals("1")) { // 2만 들어온 경우
                    
                    pq.add(Integer.valueOf(num[1]));

                }else{
                    if(!pq.isEmpty()) pq.poll();
                    else System.out.println("#" + t + " " + -1);
                    
                }
            }

            System.out.println("#" + t + " " + pq.poll());

        }
        sc.close();
    }
}
