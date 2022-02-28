package Apple_And_Orange;

import java.util.List;

public class Apple_Orang {
	
	static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer>  oranges)
	{
		int apple_counter=0;
		int orange_counter=0;
		
		for(int i =0;i<apples.size();i++)
		{
			int loc_temp = a + apples.get(i);
			if(loc_temp<=t && loc_temp>=s)
			{
				apple_counter++;
			}
		}
		for(int i =0;i<oranges.size();i++)
		{
			int loc_temp = b + oranges.get(i);
			if(loc_temp<=t && loc_temp>=s)
			{
				orange_counter++;
			}
		}		
		System.out.println(apple_counter);
		System.out.println(orange_counter);
	}

}
