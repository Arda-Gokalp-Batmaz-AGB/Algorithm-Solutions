package Jesse_And_Cookies;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> A) {
    	
    	
    	PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	
    	for (int i = 0; i < A.size(); i++) {
			pq.add(A.get(i));
		}
    	
    	int iterationCount = 0;
    	while(true)
    	{
    		if(pq.peek() >= k)
    		{
    			return iterationCount;
    		}
    		
    		if(pq.size() <2)
    		{
    			break;
    		}
    		int first = pq.poll();
    		int second = pq.poll();
    		
    		int sweetness = calculateSweetness(first, second);
    		
    		pq.add(sweetness);
    		

    		iterationCount++;
    		

    	}
    	//System.out.println(iterationCount);
		return -1;
    // Write your code here

    }
    public static int calculateSweetness(int first,int second)
    {
    	return (first * 1 ) + (2 * second);
    	
    }

}

