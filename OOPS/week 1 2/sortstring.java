import java.util.*;
import java.lang.*;
class sortstring{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of an array:");
	int s=sc.nextInt();
	int n=s+1;
	String[] a=new String[n];
	System.out.println("enter "+s+" names");
	for(int i=0;i<n;i++)
		a[i]=sc.nextLine();
	for(int i=0;i<n;i++)
		for(int j=0;j<n-1;j++)
			if(a[j].compareTo(a[j+1])>0){
				String temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
	for(int i=0;i<n;i++) System.out.println(a[i]);
}
}