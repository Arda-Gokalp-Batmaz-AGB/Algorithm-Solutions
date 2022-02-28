package Minimum_Absolute_Difference_in_an_Array;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(List<Integer> arr) {
    	Collections.sort(arr);
    	int min = Integer.MAX_VALUE;
    	boolean positive = false;
		if(arr.get(0)<0)
		{
			positive = false;
		}
		else
		{
			positive = true;
		}
		for (int i = 0; i < arr.size()-1; i++) 
		{
			int current = arr.get(i);
			int next = arr.get(i);
			
			if(Math.abs(current-next) < min)
			{
				min = Math.abs(current-next);
			}
		}
		return min;
    // Write your code here

    }

}

