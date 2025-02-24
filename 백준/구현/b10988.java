package 백준.구현;

import java.util.Scanner;

public class b10988 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        boolean pal = true;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) == word.charAt(word.length() -1 -i)) pal=true;
            else {
                pal = false;
                break;
            }
        }

        if(pal == true){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
