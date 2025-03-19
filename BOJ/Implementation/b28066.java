package BOJ.Implementation;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class b28066 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Deque<Integer> deque = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            deque.add(i);
        }

        while (deque.size() > 1) {
            if (deque.size() <= K) {
                break;
            }
            deque.addLast(deque.pollFirst());

            for (int i = 0; i < K-1; i++) {
                deque.poll();
            }


        } 

        System.out.println(deque.poll());

    }
}
