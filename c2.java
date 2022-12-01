/*
  Each new term in the Fibonacci sequence is generated by adding the previous two terms.
  By starting with 1 and 2, the first 10 terms will be:
  1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
  By considering the terms in the Fibonacci sequence whose values do not exceed four million, 
  find the sum of the even-valued terms.
*/


import java.lang.*;
public class c2 
{

	public static void main(String[] args) 
	{
      int c=0; int d=0;
      for(int i=1;i<=4000000;i++)
      {
       c=c+i;
       if(c%2==0 && c<=4000000)
    	   d=d+c;
    	   
	  }
      System.out.println("The sum of even valued Fibonacci numbers whose value do not exceed four million are: " +d);
    }
}