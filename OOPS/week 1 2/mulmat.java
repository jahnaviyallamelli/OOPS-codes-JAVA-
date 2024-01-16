import java.util.*;
import java.lang.*;
class mulmat{
public static void main(String[] args){
	int m1,n1,m2,n2;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size of first matrix:");
	m1=sc.nextInt();
	n1=sc.nextInt();
	System.out.println("enter size of second matrix:");
	m2=sc.nextInt();
	n2=sc.nextInt();
	int first[][]=new int[m1][n1];
	int second[][]=new int[m2][n2];
	int mul[][]=new int[m1][n2];
	System.out.println("enter elements of first matrix:");
	for(int i=0;i<m1;i++)
		for(int j=0;j<n1;j++)
			first[i][j]=sc.nextInt();
	System.out.println("enter elements of second matrix:");
	for(int i=0;i<m2;i++)
		for(int j=0;j<n2;j++)
			second[i][j]=sc.nextInt();
	for(int i=0;i<m1;i++){
		for(int j=0;j<n2;j++){
		int val=0;
			for(int k=0;k<n1;k++){
				val+=first[i][k]*second[k][j];
			}
			mul[i][j]=val;
		}
	}
	for(int i=0;i<m1;i++){
		for(int j=0;j<n2;j++){
			System.out.print(mul[i][j]+"\t");}
		System.out.println();
	}
}
}