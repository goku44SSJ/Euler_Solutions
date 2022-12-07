/*
   There exists exactly one Pythagorean triplet for which a + b + c = 1000.
   Find the product abc.
*/
class c9 
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=1000;i++)
		{
		 for(int j=1;j<=1000;j++)
		 {
			 for(int k=1;k<=1000;k++)
			 {
				 if(i<j && j<k)
				 {
					 if((Math.pow(i, 2)+Math.pow(j, 2))==Math.pow(k, 2))
					 {
						 if(i+j+k==1000)
						 {
							 System.out.println("a is " +i +", b is " +j +" and c is " +k);
							 int d=i*j*k;
							 System.out.println("The product is " +d);
						 }
					 }
				 }
			 }
		 }
		}
	}

}
