class java2_5_1 implements Cloneable{
    int emp_id;
    String name;

    java2_5_1(int emp_id,String name){
        this.emp_id=emp_id;
        this.name=name;
    }
    public static void main(String args[]){
        try{
            java2_5_1 j=new java2_5_1 (5000,"Pranav");

            java2_5_1 j2=(java2_5_1)j.clone();

            System.out.println(j.emp_id+" "+j.name);
            System.out.println(j2.emp_id+" "+j2.name);
        }catch(CloneNotSupportedException c){}
    }
}
