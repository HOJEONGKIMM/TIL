package 백준.Stack;

import java.util.Scanner;
import java.util.Stack;

public class b1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<N; i++){ 
            stack.add(sc.nextInt());
        }

        while(!stack.isEmpty()){
            while(stack.pop() < stack.peek()){
                System.out.println("-");
            }
            if(stack.pop() > stack.peek()){
                
            }
        }

    }
}
