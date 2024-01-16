import java.util.*;
import java.lang.*;
class calculator{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a and b values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("enter 1.add\n 2.sub\n 3.mul \n4.div \n5.moldulo \n");
	int ch=sc.nextInt();
	switch(ch){
		case 1->System.out.println(a+b);
		case 2->System.out.println(a-b);
		case 3->System.out.println(a*b);
		case 4->System.out.println(a/b);
		case 5->System.out.println(a%b);
		default->System.out.println("end");
	}
}
}