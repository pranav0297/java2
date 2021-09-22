

public class CustomException extends Exception{
    private String message;

    public CustomException(String message){
        super(message,null,false,false);
        this.message = message;
    }



    public String getMessage(){
        return message;
    }

    public String toString(){
        return "CustomException";
    }
}

class java2_13 {
    public static void main (String[] args) {
        try{
            throw new CustomException("this is custom exception");
        }
        catch (CustomException e){
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
