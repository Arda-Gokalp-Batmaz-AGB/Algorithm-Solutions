package Greedy_Florist;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Solution {

    // Complete the getMinimumCost function below.
    static int getMinimumCost(int k, int[] c) {
    	
    	Arrays.sort(c);
    	int result = 0;
    	if(k >= c.length)
    	{
    		for (int i = 0; i < c.length; i++) 
    		{
				result += c[i];
			}
    	}
    	else
    	{
    		int tempK = k;
    		int factor = 0;
    		for (int i = c.length-1; i >= 0; i--) {
				if(tempK <= 0)
				{
					factor ++;
					tempK = k;
				}
				tempK--;
				result += (factor+1) * c[i];
			}
    	}
    	
		return result;
    }

}