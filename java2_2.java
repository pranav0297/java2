import java.util.*;
public class java2_2 {

    void sort(String s ){

        char[] arr =s.toCharArray();
        char temp;
        int len = s.length();

        for(int i =0;i<len-1;i++){
            for(int j=0;j<len-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        System.out.print("Sorted String : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
    public static void main (String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s =sc.nextLine();
        java2_2 j = new java2_2();
        j.sort(s);

    }
}
