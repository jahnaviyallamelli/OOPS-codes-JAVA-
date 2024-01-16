import java.util.*;
import java.lang.*;
class palindrome{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int val=a;
	int sum=0;
	while(a>0){
		int rem=a%10;
		sum=(sum*10)+rem;
		a/=10;
	}
	if(sum==val) System.out.println("yayy it is palindrome!!");
	else System.out.println("not a palindrome");	
}
}