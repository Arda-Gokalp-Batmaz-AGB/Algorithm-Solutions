package z2D_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class z2D_Arrays {
    public static int hourglassSum(List<List<Integer>> arr) 
    {
    	int row = 0;
    	int max = Integer.MIN_VALUE;
    	int i = 0;
    	while(true)
    	{
    		if( 2+i >= 6 )
    		{
    			i = 0;
    			row++;
    		}
    		if(row +2 >= 6)
    			break;
    		
    		int sum = arr.get(0+row).get(0+i) + arr.get(0+row).get(1+i) + arr.get(0+row).get(2+i) 
    				+ arr.get(1+row).get(1+i) 
    				+ arr.get(2+row).get(0+i) + arr.get(2+row).get(1+i) + arr.get(2+row).get(2+i);

    		
    		if(sum > max)
    			max = sum;
    		

    		i++;
    	}
    	
		return max;
    }


}
