package swea;

// 계산기3

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class swea1224 {
    public static void main(String[] args) {
        Stack<Integer> infix = new Stack<>();

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        Map<Character, Integer> op = new HashMap<>();
        op.put('(', 0);
        op.put('+', 1);
        op.put('-', 1);
        op.put('/', 2);
        op.put('*', 2);

        StringBuilder sb = new StringBuilder(); 

        for(int i=0; i<line.length(); i++){
            if(line.charAt(i) == '('){

            }else if(line.charAt(i) >= '0' && line.charAt(i) <= '9' ){
                sb.append(line.charAt(i));
            }else{  // '('가 들어올 때

            }

        }





        ////////////////////////계산/////////////////////
        Stack<Integer> cal = new Stack<>();


    }
}
