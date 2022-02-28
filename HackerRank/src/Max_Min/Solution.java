package Max_Min;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

	public static int maxMin(int k, List<Integer> arr) {
		Collections.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i + k-1 < arr.size(); i++) {
			if(Math.abs(arr.get(i+k-1)-arr.get(i)) < min)
			{
				min = Math.abs(arr.get(i+k-1 )-arr.get(i));
			}
		}
		return min;


	}
}
