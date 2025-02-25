package 백준.Implementation;

import java.util.*;

public class b1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word.toLowerCase();

        int[] arr = new int[26];
        
        Map<Character, Integer> map = new HashMap();
        for(int i=0; i < word.length(); i++){
            map.put(word.charAt(i), 1);
        }
        
        int max = 0;
       
        
    }
}
