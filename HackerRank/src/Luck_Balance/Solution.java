package Luck_Balance;
import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result{

    /*
     * Complete the 'luckBalance' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. 2D_INTEGER_ARRAY contests
     */

    public static int luckBalance(int k, List<List<Integer>> contests) {
    	
    	int maxLuckBalance = 0;
    	int chooseCount = 0;

    	for (int i = 0; i < contests.size(); i++) 
    	{
    		List<Integer> currentContest = contests.get(i);
    		
    		if(currentContest.get(1) == 0)
    		{
    			maxLuckBalance += currentContest.get(0);
    			contests.remove(currentContest);
    			i = i-1;
    		}
		}
    	//System.out.println("Before:" + contests);
    	Collections.sort(contests, new sortContents());
    	//System.out.println("After" + contests);
    	

    	for (int i = 0; i < contests.size(); i++) 
    	{
    		List<Integer> currentContest = contests.get(i);
    		
    		if(k > chooseCount)
    		{
    			maxLuckBalance += currentContest.get(0);
    			chooseCount++;
    		}
    		else
    		{
    			maxLuckBalance -= currentContest.get(0);
    		}
    			
		}
		return maxLuckBalance;
    // Write your code here

    }
}

class sortContents  implements Comparator <List<Integer>> 
{
	@Override
	public int compare(List<Integer> o1, List<Integer> o2) {
		if(o1.get(0) > o2.get(0))
		{
			return -1;
		}
		else
		{
			return 1;
		}
		//return 0;
	}
}