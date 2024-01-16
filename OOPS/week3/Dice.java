package internal;
import java.util.*;
public class Dice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        for(int i=0;i< 10;i++){
            int dice1=rolldice();
            int dice2=rolldice();
            System.out.println(dice1+" "+dice2);
            if(dice1 == dice2)
              count++;
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("successful"+count);
    }
    static int rolldice(){
        Random r=new Random();
        return r.nextInt(6)+1;
    }
}
