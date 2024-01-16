package internal;
import java.util.*;
class Books{
    String name,author;
    int count;
    Books(String name,String author,int count){
        this.name=name;
        this.author=author;
        this.count=count;
    }
    void sell(String name,int copies){
        if(copies <= this.count){
            this.count -=copies;
            System.out.println("you purchased" +copies +"Books");
            System.out.println(name+"Available count "+this.count);
        }
        else{
            System.out.println("Out of stock");
        }
    }
}
class Customers{
    int id;
    String name,address;
    Customers(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
    }
}
public class Customerbooks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" ENterr num od books ");
        int n=sc.nextInt();
        Books[] book=new Books[n];
        for(int i=0;i<n;i++){
            System.out.println("ENter the book details(name,author,count)");
            book[i] = new Books(sc.next(),sc.next(),sc.nextInt());
        }
        System.out.println("ENterr num of customers");
        int m=sc.nextInt();
        Customers[] customer=new Customers[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter the customer details(id,name,address)");
            customer[i]=new Customers(sc.nextInt(),sc.next(),sc.next());
        }
        for (int i = 0; i < m; i++) {
            System.out.println(customer[i].name+"Enter book you want to purchase and num of books");
            String name=sc.next();
            int copies=sc.nextInt();
            int flag=0;
            for(int j=0;j<n;j++){
                if(name.equals(book[j].name)){
                    flag=1;
                    book[j].sell(name,copies);
                }
            }
            if(flag == 0){
                System.out.println("out of stock");
            }
        }

    }
}
