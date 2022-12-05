/*
  Find the difference between the sum of the squares of the first one hundred natural numbers
  and the square of the sum
*/
import java.lang.*;
class c6 
{

	public static void main(String[] args) 
	{
		int c=0,d=0;
		for(int i=1;i<=100;i++)
		{
			c=c+(i*i);
			d=d+i;//I could have used Math.pow but then I would have to convert c to a double data type
			
		}
		d=d*d;
		int e=d-c;
		System.out.println("The difference between the sum of the squares of the squares of the first"
				+ "one hundred natural numbers and the square of the sum is : " +e);

	}

}
