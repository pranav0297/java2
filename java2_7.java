import java.util.*;
public class java2_7 {
    void Sec_convert(int seconds)
    {
        int Day = seconds / (24 * 3600);
        seconds = seconds % (24 * 3600);

        int Hour = seconds / 3600;
        seconds %= 3600;

        int Minutes = seconds / 60 ;
        seconds %= 60;

        int Seconds = seconds;

        System.out.println( Day + " " + "days " + Hour+ " " + "hours " + Minutes + " "+ "minutes " + Seconds + " "+ "seconds ");
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seconds : ");
        int n = sc.nextInt();

        java2_7 j = new java2_7();
        j.Sec_convert(n);

    }
}

