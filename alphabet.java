/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		char c;
		Scanner input=new Scanner(System.in);
		c=input.next().charAt(0);
		
	
	//	System.out.println("enter your number");
		if
		((c>='a' && c<='z')||(c>='A'&& c<='Z'))
		{
			System.out.println("Alphabet");
		}
	//		else if (a<0)
	//	{
	//		System.out.println("Negative");
	//	}
		else 
		{
			System.out.println("No");
		}
	
		
		

	}
}
