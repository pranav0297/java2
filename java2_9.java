import java.io.*;
abstract class Furniture{
    abstract String stress(int n);
    abstract String  fire(String Argument);
}

class Wooden extends Furniture{
    String stress(int n){
        String s = "ok";
        String s1 ="Not";
        if(n>=50)
            return fire(s);
        else
            return fire(s1);
    }
    String fire(String Argument) {
        String s = "ok";
        String s1 = "Not";
        if (Argument == s){
            System.out.println("Wooden chair is safe from fire");
        return "0";
    }

        else {
            System.out.println("Wooden table is not safe from fire");
            return "0";
        }
    }
}

class Metal extends Furniture{
    String stress(int n){
        String s = "ok";
        String s1 ="Not";

        if(n>=40)
            return fire(s);

        else
            return fire(s1);
    }
    String fire(String Argument){
        String s = "ok";
        String s1 ="Not";
        if(Argument==s) {
            System.out.println("Metal chair is safe from fire");
            return "0";
        }

        else{
            System.out.println("Metal table is not safe from fire");
            return "0";
        }
    }
}
public class java2_9
{
    public static void main (String[] args) {
        Wooden chair1 = new Wooden();
        Wooden table1 = new Wooden();
        chair1.stress(50);
        table1.stress(40);


        Metal chair2 = new Metal();
        Metal table2 = new Metal();
        chair2.stress(40);
        table2.stress(30);
        
    }
}
