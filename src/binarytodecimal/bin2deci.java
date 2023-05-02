package binarytodecimal;
import java.util.Scanner;
public class bin2deci {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//THIS IS A PROGRAM TO CONVERT BINARY TO DECIMAL
		System.out.println("Enter the binary number");
		int ip=s.nextInt();
		s.close();
		int rem;
		double result=0;
		int i=0;
		while(ip>0) // to enter into the loop just check if ip we enerd is greater than 0
		{
			rem=ip%10; //% gives only the reminder
			result=rem*Math.pow(2,i)+result;
			ip=ip/10; // retains the quotient
			i=i+1; //increment i values from 0 in pow func
			
		}
		System.out.println("The decimal value is "+(int)result);
		}

}
