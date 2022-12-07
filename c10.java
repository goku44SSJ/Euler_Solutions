/*
 * Find the sum of all the primes below two million.
 */
public class c10 
{

	public static void main(String[] args) 
	{
		long c=0L;
		for(long i=1L;i<=2000000L;i++)
		{
			boolean b=c10.checkPrime(i);
			if(b==true)
				c=c+i;
		}
		System.out.println("The sum of all prime numbers upto 2million is : " +c);
		}

	static boolean checkPrime(long n)
	{int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			return true;
		else
			return false;
	}
}

