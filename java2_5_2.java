class java2_5_2{
      int emp_id;
    String name;

    java2_5_2(java2_5_2 copy){
        this.emp_id=copy.emp_id;
        this.name=copy.name;
        System.out.println("Name = "+name+"Emp_id = "+emp_id);

    }
    java2_5_2(String name, int emp_id){
        this.emp_id=emp_id;
        this.name=name;
        System.out.println("Name = "+name+"Emp_id = "+emp_id);

    }
    public static void main(String[] args){
        java2_5_2 j = new java2_5_2("pranav",5001);
        java2_5_2 j1 = new java2_5_2(j);

        }
    }


