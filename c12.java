/*
 * What is the value of the first triangle number to have over five hundred divisors?
 */
class c12 
{
	public static void main(String[] args) 
	{int c=0;
		for(int i=1;i>=0;i++)
		{
			c=c+i;
			int b=c12.checkDivisor(c);
			if(b>500)
			{
				System.out.println(c);
				break;
			}
			
		}

	}
	
	static int checkDivisor(int n)
	{
		int c=0;
		for(int i=1; i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}return c;
	}

}
