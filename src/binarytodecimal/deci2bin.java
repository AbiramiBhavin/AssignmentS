package binarytodecimal;
import java.util.Scanner;
public class deci2bin {

	public static void main(String[] args) {
		//THIS PGM IS USED TO CONVERT A DECIMAL NUMBER TO BINARY Number
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the decimal number");
		int ip=s.nextInt();
		s.close();
		
		//int length=a.length();
		int rem=0;
		int result=0;
		int i=0;
		while(ip>0)// to simply check if the given no is greater than 0
		{
			rem=ip%2; // since we are converting to binary weuse 2
	result = result+rem*(int)Math.pow(10, i);
	//System.out.println(result);

			ip=ip/2;
			i=i+1;
			
		}
		System.out.println("The binary Number is "+result);

		
		

	}

}
