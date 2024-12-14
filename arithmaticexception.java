import java.util.*;
public class arithmaticexception{
    public static void main(String args[]){
        //try catch
        try{
            int d=90/0;
        }catch(ArithmeticException v)
        {
            System.out.println("Bad request");
        }//try catch and finnally
        try{
            int d=90/0;
        }catch(ArithmeticException v){
            System.out.println("catch book is running");
        }
        finally{
            System.out.println("finnally is running");
        }
    }
}