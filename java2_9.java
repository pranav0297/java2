import java.io.*;
    abstract class Furniture{
        abstract String stress(int n);
        abstract void fire(String Argument);
    }

    class Wooden extends Furniture{
        String stress(int n){
            String s = "ok";
            String s1 ="Not";
            if(n>=50)
                return s;
            else
                return s1;
        }
        void fire(String Argument){
            String s = "ok";
            String s1 ="Not";
            if(Argument==s)
                System.out.println("Wooden chair is safe from fire");


            else
                System.out.println("Wooden table is not safe from fire");
        }
    }

    class Metal extends Furniture{
        String stress(int n){
            String s = "ok";
            String s1 ="Not";

            if(n>=40)
                return s;

            else
                return s1;
        }
        void fire(String Argument){
            String s = "ok";
            String s1 ="Not";
            if(Argument==s)
                System.out.println("Metal chair is safe from fire");

            else
                System.out.println("Metal table is not safe from fire");
        }
    }
    public class java2_9 {
        public static void main (String[] args) {
            Wooden chair1 = new Wooden();
            Wooden table1 = new Wooden();
            String f =  chair1.stress(50);
            chair1.fire(f);
             f =  table1.stress(20);
            table1.fire(f);

            Metal chair2 = new Metal();
            Metal table2 = new Metal();
            String f1 = chair2.stress(40);
            chair2.fire(f1);
            f1 = table2.stress(30);
            table2.fire(f1);

        }
    }




