package Missing_Numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Missing_Numbers {

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
    	HashMap<Integer, Integer> map_1 = new HashMap<Integer,Integer>();
    	HashMap<Integer, Integer> map_2 = new HashMap<Integer,Integer>();
    	List<Integer> result = new ArrayList<Integer>();
    	for (int i = 0; i < arr.size(); i++) 
    	{
			if(!map_1.containsKey(arr.get(i)))
			{
				map_1.put(arr.get(i), 1);
			}
			else
			{
				map_1.put(arr.get(i), map_1.get(arr.get(i))+1);
			}
		}
    	for (int i = 0; i < brr.size(); i++) 
    	{
			if(!map_2.containsKey(brr.get(i)))
			{
				map_2.put(brr.get(i), 1);
			}
			else
			{
				map_2.put(brr.get(i), map_2.get(brr.get(i))+1);
			}
		}
    	if(map_1.size()>=map_2.size())
    	{
        	for(int key : map_1.keySet())
        	{

        		if(map_2.containsKey(key))
        		{

        			if((int)map_1.get(key)!=(int)map_2.get(key))
        			{
        				result.add(key);
        			}
        		}
        		else
        		{
        			result.add(key);
        		}
        	}
    	}
    	else
    	{
        	for(int key : map_2.keySet())
        	{

        		if(map_1.containsKey(key))
        		{
        			if((int)map_1.get(key)!=(int)map_2.get(key))
        			{
        				result.add(key);
        			}
        		}
        		else
        		{
        			result.add(key);
        		}
        	}
    	}
		return result;
    // Write your code here

    }


}
