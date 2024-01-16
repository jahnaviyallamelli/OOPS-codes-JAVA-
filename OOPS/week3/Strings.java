package internal;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the string 1");
        String str1=sc.next();
        System.out.println("Enter the string 2");
        String str2=sc.next();
        System.out.println("compareTo method");
        if(str1.compareTo(str2) == 0){
            System.out.println("Equal");
        }
        else if(str1.compareTo(str2) == 1){
            System.out.println("greater");
        }
        else{
            System.out.println("lower");
        }
        System.out.println("equals method");
        if(str1.equals(str2)){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
        System.out.println("concatenation");
        System.out.println(str1.concat(str2));
        System.out.println("length ");
        System.out.println(str1.length());
        System.out.println("reverse ");
        for (int i = str1.length() -1; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }
        System.out.println(" ");
        System.out.println("upper and lower of ");
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println("usage of index of");
        System.out.println("enter the alphabet");
        String ch=sc.next();
        int count=0;
        for(int i=0;i< str1.length();i++){
            if(str1.charAt(str1.indexOf(ch)) == str1.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("substring");
        System.out.println(str1.substring(1,2));
    }
}
