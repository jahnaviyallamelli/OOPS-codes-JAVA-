import java.util.*;
import java.lang.*;
class maxandmin{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a[]={5,6,4,3,9};
	int max=0,min=999;
	for(int i=0;i<a.length;i++){
		if(a[i]>max) max=a[i];
		if(a[i]<min) min=a[i];
	}
	System.out.println("max of given num= "+max);
	System.out.println("min of given num="+min);
}
}