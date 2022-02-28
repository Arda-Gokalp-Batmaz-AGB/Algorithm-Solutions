package Between_Two_Sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Between_Two_Sets {
	public static int findSmallestCommonMultiplier(List<Integer> numbers)
	{
		int result = 1;
		int divisor = 2;
		int counter = 0;
		boolean stillDivisible = false;
		boolean loopIsRunning = true;
		while(loopIsRunning)
		{
			boolean containsFactor = false;
			for (int i = 0; i < numbers.size(); i++) 
			{
				if(numbers.get(i)==1)
				{
					counter++;
				}
				if(counter>=numbers.size())
				{
					loopIsRunning=false;
					break;
				}
				if(numbers.get(i)%divisor==0)// && containsFactor==false
				{
					stillDivisible = true;
					numbers.set(i, numbers.get(i)/divisor);
					if(containsFactor==false)
					{
						containsFactor=true;
						result = divisor * result;
					}

				}
			}
			if(stillDivisible==false)
			{
				divisor++;	
			}

			counter=0;
			stillDivisible=false;
		}
		return result;

	}
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		List<Integer> numbers = new ArrayList<Integer>();
		int smallestMultiplier = findSmallestCommonMultiplier(a);
		int tempN = 0;
		Collections.sort(b);
		//numbers.add(tempN);
		//System.out.println(smallestMultiplier);
		while(true)
		{
			if(b.get(0)>=tempN + smallestMultiplier)
			{
				tempN = smallestMultiplier + tempN;
				numbers.add(tempN);
				for (int i = 0; i < b.size(); i++) 
				{
					if(b.get(i) % tempN!=0)
					{
						numbers.remove(Integer.valueOf(tempN));
						break;
					}
				}
				
			}
			else
			{
				break;
			}
		}
		//System.out.println(numbers);
		return numbers.size();
		// Write your code here

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		List<Integer> list1 = new ArrayList<Integer>(n);
		List<Integer> list2 = new ArrayList<Integer>(m);
		for (int i = 0; i < n; i++) 
		{
			int t = in.nextInt();
			list1.add(t);
		}
		for (int i = 0; i < m; i++) 
		{
			int t = in.nextInt();
			list2.add(t);
		}
		System.out.println(getTotalX(list1,list2));
	}

}