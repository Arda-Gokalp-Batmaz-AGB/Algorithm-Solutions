package Beautiful_Triplets;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Beautiful_Triplets {

	public static int beautifulTriplets(int d, List<Integer> list) 
	{
		int counter = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			if(list.contains(list.get(i)+d) && list.contains(list.get(i)+2*d))
			{
				counter++;
			}
				
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		List<Integer> list = new ArrayList<Integer>(n);
		for (int i = 0; i < n; i++) 
		{
			int t = in.nextInt();
			list.add(t);
		}
		System.out.println(beautifulTriplets(d, list));
	}

}
