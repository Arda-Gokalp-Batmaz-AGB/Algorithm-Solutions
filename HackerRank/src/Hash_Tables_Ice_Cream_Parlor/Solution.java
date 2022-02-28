package Hash_Tables_Ice_Cream_Parlor;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'whatFlavors' function below.
	 *
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY cost
	 *  2. INTEGER money
	 */

	public static void whatFlavors(List<Integer> cost, int money) {
		int firstNumb = money;
		int secondNumb = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> rep = new HashMap<Integer, Integer>();
		for (int i = 0; i < cost.size(); i++) {
			int current = cost.get(i);
			if(!map.containsKey(current))
			{
				map.put(current, i);
			}
			else
			{
				rep.put(current, i);
			}
		}
		
		for (int key : map.keySet()) 
		{
			int sub = Math.abs(key-money);
			if(map.containsKey(sub))
			{
				int firstID = -2;
				int secondID = -3;
				if(map.get(sub) > map.get(key))
				{
					firstID = map.get(key);
					secondID = map.get(sub);
				}
				else if(map.get(sub) < map.get(key))
				{
					firstID = map.get(sub);
					secondID = map.get(key);
				}
				else
				{
					firstID = map.get(sub);
					secondID = rep.get(key);
				}

				System.out.println((firstID+1) + " " + (secondID+1));

				break;
			}
		}

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bufferedReader.readLine().trim());

		for (int tItr = 0; tItr < t; tItr++) {
			int money = Integer.parseInt(bufferedReader.readLine().trim());

			int n = Integer.parseInt(bufferedReader.readLine().trim());

			String[] costTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> cost = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				int costItem = Integer.parseInt(costTemp[i]);
				cost.add(costItem);
			}

			Result.whatFlavors(cost, money);
		}

		bufferedReader.close();
	}
}