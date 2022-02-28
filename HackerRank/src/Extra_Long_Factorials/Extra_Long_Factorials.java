package Extra_Long_Factorials;

import java.math.BigInteger;
import java.util.Scanner;

public class Extra_Long_Factorials {
	
	  static void extraLongFactorials(int n)
	   {
		//  BigInteger result = 1 ;
		  BigInteger result = new BigInteger("1");
		  for(int i = n; 1<i ; i--)
		  {
			  result = result.multiply(BigInteger.valueOf(i)); 

		  }
		  System.out.println(result);
	    }
	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
		int numb = STDIN.nextInt();
		extraLongFactorials(numb);

	}

}
