class Customer{

    String Customer_name;
    int Customer_Mno;

    public void Wait(int n ){
        System.out.println("your order in a queue, please wait and order number is : "+n);
    }

    public void collect(){
        System.out.println("your coffee is ready, enjoy!");
    }
}


//class Cashier
class Cashier{

    int recieved_amount(){
        System.out.println("recieved_amount and genrate token ");

       return  customer.wait(token);
        
    }

    void waiting_queue(int token){
        ArrayList <Integer> waiting_list = new ArrayList<Integer>();
        waiting_list.add(token);
    }

}
// class Barista
class Barista{

    void getorder(){

        while(queue != null)
            waiting_list.get(0);
        System.out.println("your order is in process");
    }
    ArrayList <Integer> ready_list = new ArrayList<Integer>();

    void order_ready(){
        while(queue != null){
            System.out.println("order ready");
            ready_list.add(waiting_list.get(0));
            a.remove(0);
            customer.collect();
        }
    }

}
