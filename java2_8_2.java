
import java.util.*;
class java2_8_2 {
    void keboard(String word) {
        int  count =0;
         do{
            if (word.charAt(0) == word.charAt(word.length() - 1)) {
                System.out.println("First and last character are equals for the word");
                count +=1;
            } else {
                System.out.println("First and last character are not equals for the word");
                count +=1;
            }
        }while (!word.equals("done") && count ==0);
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = sc.next();
        java2_8_2 j = new java2_8_2();
        j.keboard(word);

    }
}


