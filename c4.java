/*
A palindromic number reads the same both ways. 
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.  
*/

import java.lang.*;
public class c4 
{

	public static void main(String[] args) 
	{
		int c=0,e=0;
		for(int i=100;i<=999;i++)
		{
			for(int j=100;j<=999;j++)
			{
				int d=i*j;
				boolean b=c4.checkPalin(d);
				if(b==true)
					e=d;
				if(c<e)
					c=e;
			}		

		}
		System.out.println("The largest palindrome made from 3 digit numbers is : " +c);
	}
	
	static boolean checkPalin(int n)
	{
		int r,t=n,c=0;
		while (n>0)
		{
			r=n%10;
			c=(c*10)+r;
			n=n/10;
		}
		if(t==c)
			return true;
		else
			return false;
	}

}
