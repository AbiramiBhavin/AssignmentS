package binarytodecimal;

import java.util.Scanner;

public class bin2oct {
	//THIS PGM IS TO CONVET BINARY TO OCTAL
	//FOR THAT FIRST WE NEED TO CONVERT BINARY TO DECIMAL
	//THEN FROM DECIMAL WENEED TO CONVERT TO OCTAL
	//THEREBY CONVERTING BINARY TO OCTAL

	// BINARY TO DECIMAL
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
			rem=bin%10;// since we  are converting to decimal using 10
			result= result+(int)(rem*Math.pow(2,i));
			bin=bin/10;
			i=i+1;
			
		}
		decivalue=result;
		System.out.println("The Decimal Value is "+decivalue);
		//DECIMAL TO OCTAL
		while(decivalue>0)
		{
			rem1=(int)decivalue%8; // since we are converting to octal using 8
			result1 = result1+(int)(rem1*Math.pow(10, j));
			decivalue=decivalue/8;
			j=j+1;
		}
		System.out.println("The Octal Value is "+result1);

	}

}
