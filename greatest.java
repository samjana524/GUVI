/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a=1,b=2,c=3;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
	
	//	System.out.println("enter your number");
		if((a>=b) && (a>=c))
	
		{
			System.out.println(+a);
		}
			else if ((b>=c) && (b>=a))
		{
			System.out.println(+b);
		}
		else 
		{
			System.out.println(+c);
		}
	
		
		

	}
}
