import java.util.*;
import java.lang.*;
class quadratic{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println("roots for given equation is:"+a+"x^2+" +b+"x+ "+c);
	double val=Math.sqrt(((b*b)-4*a*c)/(2*a));
	double root1=-b+val;
	double root2=b+val;
	System.out.println("root1="+root1+"\nroot2="+root2);
}
}