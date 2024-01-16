package internal;

import java.util.*;
 class ploy{
    public int e_id,e_salary,e_age;
    private String e_name,e_gender,e_address,e_designation;
     ploy(int e_id,String e_name,int e_age,String e_gender,String e_designation,int e_salary,String e_address){
        this.e_id=e_id;
        this.e_name=e_name;
        this.e_age=e_age;
        this.e_gender=e_gender;
        this.e_designation=e_designation;
        this.e_salary=e_salary;
        this.e_address=e_address;
     }
     public void details(){
        System.out.println(e_id+" "+e_name+" "+e_age+" "+e_gender+" "+e_designation+" "+e_salary+" "+e_address);
     }
}

public class Oops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee id");
        int id=sc.nextInt();
        ploy Nikhil=new ploy(1, "NIkhil", 20, "male", "softwae", 200000,"siddipet" );
        ploy shiva=new ploy(2, "shiva", 20, "male", "softwae", 200000,"siddipet" );
        ploy surya=new ploy(3, "surya", 20, "male", "softwae", 200000,"siddipet" );
        displaydetails(new ploy[]{Nikhil,shiva,surya},id);
    }
    public static void displaydetails(ploy[] emp,int target){
       for(ploy e: emp){
        if(e.e_id == target){
            e.details();
            return;
        }
       }
       System.out.println("ID not found");
    } 
}
