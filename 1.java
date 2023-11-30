// find prime numbers in a range.
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    System.out.println("prime numbers are: ");
		int num=5; //start from 5
		while(num<=50) //end at 50
		{
			int c=0;
			for(int i=num/2;i>1;i--)
			{
				if(num%i==0)
					c++;
			}
			if(c==0)
				System.out.print(num+" ");
			num++;
		}
	}
}


