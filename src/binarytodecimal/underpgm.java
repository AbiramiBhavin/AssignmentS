package binarytodecimal;
import java.util.Scanner;
 
public class underpgm
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int lastDigit, decimal=0, i=0;
	    
	    //Input binary number
		System.out.println("Enter a Binary");
		int binary = in.nextInt();
		
		
		while(binary>0){
		    //extract digit
		    lastDigit = binary%10;
		   //System.out.println(lastDigit);
		    
		    //multiply digit with the 2^i and add to the sum
		    decimal += Math.pow(2,i) * lastDigit;
		    
		    //update binary by removing the last digit
		    binary = binary/10;      
		    
		    i++;    //Increment exponent ('i')
		}
		
		//output decimal
		System.out.println("Decimal: "+decimal);
	}
}