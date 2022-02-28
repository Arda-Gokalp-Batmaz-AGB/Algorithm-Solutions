package CountTriplets;
import java.io.*;

import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

	// Complete the countTriplets function below.
	static long countTriplets(HashMap<Long, Long> map, long r,List<Long> arr) 
	{
		HashMap<Long, Long> store = new HashMap<Long, Long>();
		long count = 0;
		for (int i = 0; i < arr.size(); i++) 
		{
			long current = arr.get(i);
			long right = 0;
			long left = 0;
			//map.put(current,map.getOrDefault(current, 0L)-1);
			
			if(map.containsKey(current))
			{
				map.put(current, map.get(current)-1);
			}
			if(store.containsKey(current / r) && current % r == 0)
			{
				left = store.get(current / r);
			}
			if(map.containsKey(current * r))
			{
				right = map.get(current * r);
			}
			
			
			count = left * right + count;
			
			if(store.containsKey(current))
			{
				store.put(current, store.get(current)+1);
			}
			else
			{
				store.put(current, (long) 1);
			}
			//store.put(current,store.getOrDefault(current, 0L)-1);
		}

		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		//  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		Scanner STDIN = new Scanner(System.in);
		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		int n = Integer.parseInt(nr[0]);

		long r = Long.parseLong(nr[1]);

		String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		List<Long> arr = new ArrayList<>();
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for (int i = 0; i < n; i++) {
			long arrItem = 0;
			if(i<arrItems.length)
			arrItem = Long.parseLong(arrItems[i]);
			// long arrItem = STDIN.nextlo;
		//	if((arrItem == 1 || arrItem % r == 0) && arrItem != 0)
		//	{
				arr.add(arrItem);
				if(!map.containsKey(arrItem))
				{
					map.put(arrItem, (long) 1);
				}
				else
				{
					map.put(arrItem, map.get(arrItem)+1);
				}
		//	}

		}

		long ans = countTriplets(map, r,arr);

		bufferedReader.close();

		System.out.println(ans);
	}
}
