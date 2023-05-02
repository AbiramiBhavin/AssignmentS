package binarytodecimal;

import java.util.Scanner;

public class bin2oct {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter the binary Number");
		int bin=t.nextInt();
		t.close();
		int result=0;
		int result1=0;
		int i=0;
		int j=0;
		int rem=0,rem1=0;
		int decivalue=0;
		while(bin>0)
		{
			rem=bin%10;
			result= result+(int)(rem*Math.pow(2,i));
			bin=bin/10;
			i=i+1;
			
		}
		decivalue=result;
		System.out.println(decivalue);
		while(decivalue>0)
		{
			rem1=(int)decivalue%8;
			result1 = result1+(int)(rem1*Math.pow(10, j));
			decivalue=decivalue/8;
			j=j+1;
		}
		System.out.println(result1);

	}

}
