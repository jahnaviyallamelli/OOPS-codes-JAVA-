import java.util.*;

public class InputException{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      try{
        int b=Integer.parseInt(a);
        }
      catch(Exception e){
         System.out.println(e);
      }
      finally{
      System.out.println("Execution completed");
      }
   }
}
