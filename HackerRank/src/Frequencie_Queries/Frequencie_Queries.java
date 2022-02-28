package Frequencie_Queries;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Frequencie_Queries {

	static List<Integer> freqQuery(List<List<Integer>> queries) {
		List<Integer> answer = new ArrayList<>();
		HashMap<Integer, Integer> table = new HashMap<Integer,Integer>();
		for (int i = 0; i < queries.size(); i++) {
			List<Integer> currentQuery = queries.get(i);

			int operation = currentQuery.get(0);
			int data = currentQuery.get(1);

			if(operation == 1)
			{
	    		if(!table.containsKey(data))
	    		{
	    			table.put(data, 1);
	    		}
	    		else
	    		{
	    			table.put(data, table.get(data) + 1);
	    		}
			}
			else if(operation == 2)
			{
				if(table.containsKey(data))
				{
					if(table.get(data) -1 <= 0)
					{
						table.remove(data);
					}
					else
					{
						table.put(data, table.get(data) - 1);
					}
				}
			}
			else
			{
				answer.add(checkFreq(table, data));
			}
		}
		return answer;
	}

	static int checkFreq(HashMap<Integer, Integer> table, int data)
	{
		if(table.size()*100 < data)
			return 0;
		if(table.containsValue(data))
		{
			System.out.println("1");
			return 1;
		}
		else
		{
			System.out.println("0");
			return 0;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> queries = new ArrayList<>();

		for (int i = 0; i < q; i++) {
			String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> queriesRowItems = new ArrayList<>();

			for (int j = 0; j < 2; j++) {
				int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
				queriesRowItems.add(queriesItem);
			}

			queries.add(queriesRowItems);
		}

		List<Integer> ans = freqQuery(queries);


		bufferedReader.close();
	}

}
