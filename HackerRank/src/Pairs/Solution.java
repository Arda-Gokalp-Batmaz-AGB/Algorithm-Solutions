package Pairs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'pairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int pairs(int k, List<Integer> arr) {
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
			map.put(arr.get(i), 1);
		}
        
        for (int key : map.keySet()) 
        {
			int total = k + key;
			
			if(total > map.lastKey())
			{
				break;
			}
			if(map.containsKey(total))
			{
				count++;
			}
		}
		return count;
    // Write your code here

    }

}
