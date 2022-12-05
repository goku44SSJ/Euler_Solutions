//What is the 10 001st prime number?
import java.lang.*;
class c7 
{

	public static void main(String[] args) 
	{
		int i,d=0,c=0;
		for(i=1;i>=0;i++)
		{
			boolean b=checkPrime(i);
			if(b==true)
				c++;
			if(c==10001)
			{
				d=i;
				break;
			}
			
		}
        System.out.println("The 10001st prime number is : " +d);
	}
	
	
	
    static boolean checkPrime(int n)
    {
    	int c=0,i;
    	for(i=1;i<=n;i++)
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
