import java.util.*;
import java.lang.*;
class primefactors{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any num");
	int a=sc.nextInt();
	System.out.println("prime factors are:");
	for(int i=2;i<=a;i++){
		if(a%i==0){
			int cnt=0;
			for(int j=2;j<i;j++){
				if(i%j==0) cnt++;
			}
			if(cnt==0) System.out.println(i);
		}
	}
}
}