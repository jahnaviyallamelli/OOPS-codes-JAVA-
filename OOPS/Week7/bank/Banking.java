import java.util.*;
import b.BankPackage.*;
import b.InvalidCredentialsException.*;
import b.InsufficientBalanceException.*;
import b.BankImplementation.*;

public class Banking{
   public static void main(String args[]){
   b.BankImplementation p=new b.BankImplementation("nikhil","pass",200);
   try{
   p.credentialsCheck("nikhil","password");
   }
   catch(Exception e){
     System.out.println(e);
     }
   }
}
