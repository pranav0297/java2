/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// abstract class
abstract class Library{
    abstract int status(String s);
    abstract void Book_info(int n);
}



// libarary info
class Books extends Library{

    String book_name;
    String book_author_name;
    int book_id;
    int status(String s){
        if(s=="Student can take book")
            return 1;
        else
            return 0;
    }
    void Book_info(int n){
        if(n ==1){

            System.out.println("Book Alloted");
        }
        else{
            System.out.println("not allowed");
        }
    }
}



// Student info

class Student{
    String name;
    int id;
    int classs;

    int Student_request(String name,int id, int classs){
        this.name=name;
        this.id =id;
        this.classs=classs;
        return id;
    }
}



// Librarian info
class Librarian{

    int max_books;
    int count =0;
    int  Student_record(int id){
        count =0;
        ArrayList <Integer> a = new ArrayList<Integer>();
        a.add(500);
        a.add(508);
        a.add(550);
        a.add(500);
        for(int i=0;i<a.size();i++){
            if(id ==a.get(i))
                count ++;
        }
        return count;

    }


    String max_book(int max_books){
        this.max_books=max_books;

        if(max_books < 2){
            return "Student can take book";
        }
        else{
            return "Not allowed,already having two books";


        }
    }
}


//main class
class java2_1 {
    public static void main (String[] args) {


        Student s1 = new Student();
        Student s2 = new Student();
        int r= s1.Student_request("Pranav",501,12);

        Librarian l = new Librarian();
        int lr = l.Student_record(r);

        String ss = l.max_book(lr);

        Books b = new Books();
        int l1=b.status(ss);

        b.Book_info(l1);

    }
}

