package binarytodecimal;
import java.util.Scanner;
public class deci2bin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int ip=s.nextInt();
		s.close();
		
		//int length=a.length();
		int rem=0;
		int result=0;
		int i=0;
		while(ip>0)
		{
			rem=ip%2;
	result = result+rem*(int)Math.pow(10, i);
	//System.out.println(result);

			ip=ip/2;
			i=i+1;
			
		}
		System.out.println(result);

		
		

	}

}
