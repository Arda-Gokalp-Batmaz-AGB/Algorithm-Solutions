package Absolute_Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Absolute_Permutation {

	public static List<Integer> absolutePermutation(int n, int k) 
	{
		List<Integer> result = new ArrayList<Integer>(n);
		List<Integer> temp = new ArrayList<Integer>(n);
		
		if(k==0)
		{
			for (int i = 1; i < n+1; i++) {
				result.add(i);
			}
			return result;
		}
		for (int i = 1; i < n+1; i++) {
			temp.add(i);
			result.add(0);
		}
		int direction = 1;
		int counter = 0;
		for (int i = 1; i < n+1; i++) {
			int pos_i = k+i;
			
			try {
				int tempV = temp.get(i-1);

				if(direction<0)
				{
					result.set(i-k-1,tempV);
				}
				else
				{
					result.set(i+k-1,tempV);
				}
				counter++;
				if(counter>=k)
				{	
					direction = direction * -1;
					counter = 0;
				}

				
				if(result.get(i-1)>n)
				{
					return null;
				}
			} catch(Exception e) 
			{
			   return null;
			}


		}
		//System.out.println(Arrays.toString(result));
		return result;

	}
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int queries = input.nextInt();
		for (int i = 0; i < queries; i++) {
			int n = input.nextInt();
			int k = input.nextInt();
			List<Integer> r = absolutePermutation(n, k);
			if(r==null)
				System.out.println("-1");
			else
			{

				System.out.println((absolutePermutation(n, k)));
			}

		}

	}

}

