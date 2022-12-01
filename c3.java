/*
   The prime factors of 13195 are 5, 7, 13 and 29.
   What is the largest prime factor of the number 600851475143 ?
*/
import java.lang.*;
public class c3 
{

	public static void main(String args[]) 
	{
		long c=600851475143L;
		long d=0L,e=0L;
		for(long i=1L;i<=c;i++)
		{
			boolean b=c3.checkPrime(i);
			if(b==true)
			{
				if(c%i==0)
			 d=i;	
			}
			if(e<d)
				e=d;
		}
		System.out.println("The largest prime factor of the number \"600851475143\" is: " +e);
	}
	
	static boolean checkPrime(long n)
	{ 
		int c=0;
		for(long i=1L;i<=n;i++)
			if(n%i==0)
				c++;
		if(c==2)
			return true;
		else
			return false;
	}

}
