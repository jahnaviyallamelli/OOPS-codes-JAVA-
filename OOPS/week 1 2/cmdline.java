import java.util.*;
import java.lang.*;
class cmdline{
public static void main(String[] args){
	if(args.length>0) {
		System.out.println("command line arguments are:");
		for(int i=0;i<args.length;i++) System.out.println(args[i]);
	}
	else System.out.println("no command line arguments are there");
}
}