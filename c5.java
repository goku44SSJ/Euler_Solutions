/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */


import java.lang.*;
public class c5 
{

	public static void main(String[] args) 
	{
		int c=0,d=0;
		for(int i=1;i>0;i++)
		{
			for(int j=1;j<=20;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==20)
				{
				  d=i;
				  break;
				}
			else
				c=0;
		}
		System.out.println(d);
		
     }
		
	
		

}
