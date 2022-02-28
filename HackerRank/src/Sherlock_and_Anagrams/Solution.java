package Sherlock_and_Anagrams;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

	/*
	 * Complete the 'sherlockAndAnagrams' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts STRING s as parameter.
	 */

	public static int sherlockAndAnagrams(String s) {
		
		int count = 0;
		int patternSize = 1;
		
		while(patternSize < s.length())
		{
			
			for (int i = 0; patternSize+i < s.length()+1; i++) {
				String pattern = s.substring(i, patternSize+i);
				
				for (int j = i+1; j + patternSize < s.length() + 1; j++) 
				{
					String current = s.substring(j, patternSize+j);
					
				      char patternArray[] = pattern.toCharArray();
				      Arrays.sort(patternArray);
				      char currentArray[] = current.toCharArray();
				      Arrays.sort(currentArray);
					if(Arrays.equals(patternArray, currentArray))
					{
						count++;
					}
				}
			}
			patternSize++;
		}
		return count;

	}
}

