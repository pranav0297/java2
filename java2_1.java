import java.io.*;
import java.util.*;

// abstract class
abstract class Library{
    abstract int Book_status(String s);
    abstract int Book_info(int n);
}
abstract class Student_Detail{
       int Student_info(String name, int id){
          return id;
      }
}


class Student extends Student_Detail {
    data_base d = new data_base();
    int Student_info(String name, int id){
        return d.student_data(id);
    }
}

 class data_base{
    ArrayList <Integer> a = new ArrayList<Integer>();
    int student_data(int id){
        a.add(500);
        a.add(500);
        a.add(200);
        a.add(200);
        library l = new library();
       int  count =0;
        for(int i=0;i<a.size();i++) {
            if (a.get(i) == id)
                count++;
        }
            if(count <2) {
               a.add(id);
               count =0;
                return l.Book_status("1");
            }
            else{
                count =0;
                return l.Book_status("0");
            }

        }
     }

class library extends Library {

    ArrayList <String> b = new ArrayList<String>();
    int  Book_status(String s) {
        b.add("C");
        b.add("JAVA");
        b.add("PYTHON");
        b.add("C#");
        if (s == "1") {

            Scanner sc = new Scanner(System.in);
            System.out.println("Name the book which you want :");
            String s1 = sc.nextLine();
            if (b.contains(s1))
                return Book_info(1);
            return Book_info(0);
        }
        else
            System.out.println("Not allowed");
            return 0;
    }
    int Book_info(int n){
        //data_base d = new data_base();
        if(n ==1) {
            System.out.println("Book  Available");
            return 1;
        }
        else {
            System.out.println("Book  Not Available");
            return 0;
        }
    }
}


class java2_1{
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s.Student_info("A",500);
        s1.Student_info("B",301);
        s2.Student_info("C",280);
        s3.Student_info("D",200);
    }
}




