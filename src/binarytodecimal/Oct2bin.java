package binarytodecimal;

import java.util.Scanner;

public class Oct2bin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the octal input");
		int ip=s.nextInt();
		s.close();
		int i=0,j=0;
		int rem=0,rem1=0;
		int newvalue;
		int result=0,result1=0;
		while(ip>0)
		{
			rem=ip%10;
			result=result+(int)(rem*Math.pow(8,i));
			ip=ip/10;
			i=i+1;
		}
		System.out.println("Decimal is "+result);
		newvalue=result;
		while(newvalue>0)
		{
			rem1=newvalue%2;
			result1=result1+(int)(rem1*Math.pow(10, j));
			newvalue=newvalue/2;
			j=j+1;
			
		}
		System.out.println("The binary value is "+result1);

	}

}
