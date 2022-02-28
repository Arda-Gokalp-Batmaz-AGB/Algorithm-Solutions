package active_traders;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class active_traders {
	 public static int longestSubarray(List<Integer> arr) {

		     int max = 1;
		     int counter = 1;
		     int wayValue = arr.get(0);
		     int z = 1;
		     int tut = 0;
		    for(int i = z ; i<arr.size() ; i++)
		    {
		        if(wayValue==arr.get(i))
		        {
		            counter++;
		        //    System.out.println(max);
		            if(counter>max)
		            {
		                max = counter;
		            }
		        }
		        else if(wayValue+1==arr.get(i) && (tut==0 || tut==1))
		        {
		            counter++;
		        //    System.out.println(max);
		            if(counter>max)
		            {
		                max = counter;
		            }
		            tut=1;
		        }
		        else if(wayValue-1==arr.get(i) && (tut==0 || tut==2))
		        {
		            counter++;
		        //    System.out.println(max);
		            if(counter>max)
		            {
		                max = counter;
		            }
		            tut=2;
		        }
		        else
		        {

		            wayValue = arr.get(i);
		            z = i;
		            counter = 1;
		            tut = 0;
		        }
//	            if(counter>max)
//	            {
//	                max = counter;
//	            }
		    }

		    return max;
		    }
    // Write your code here
    
	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
		int numb = STDIN.nextInt();
		ArrayList<Integer> ranked = new ArrayList<Integer>( );
		//int[] s = new int[numb];
		for(int i = 0 ;i<numb;i++)
		{
			int t = STDIN.nextInt();
			ranked.add(t);
		}
		System.out.println(longestSubarray(ranked));
	}

}