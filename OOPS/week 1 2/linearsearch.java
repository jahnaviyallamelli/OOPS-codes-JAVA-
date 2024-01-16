import java.util.*;
import java.lang.*;
class linearsearch{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a[]={55,44,33,2,1,76,8};
	System.out.println("enter any val to search");
	int s=sc.nextInt();
	int f=0;
	for(int i=0;i<a.length;i++)
		if(a[i]==s){
			 System.out.println("element found at index:"+i);
			 f=1;
		}
	if(f==0) System.out.println("element not found");
		
}
}