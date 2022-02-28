package Special_String_Again;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
    	
    	long result =s.length();
    	
    	for (int i = 0; i < s.length() -1; i++) 
    	{
    		char currentChar = s.charAt(i);
    		char nextChar = s.charAt(i+1);
			if(currentChar==nextChar)
			{
				//String test = "";
				int j = i;
				int count = 0;
				while(j+1 < s.length())
				{
					
					nextChar = s.charAt(j+1);
					j++;
					if(currentChar == nextChar)
					{
						count++;
						result = result + count;
					//	test = test + currentChar;
					}
					else
					{
						break;
					}
				}
				i = j;
				i--;
				//test = test+currentChar;
				//System.out.println(test);
			}
			else
			{
				char midChar = currentChar;
				int left = i-1;
				int right = i+1;
				char repetedChar = s.charAt(right);
				while(left >= 0 && right < s.length())
				{

						if(s.charAt(left)==s.charAt(right) && s.charAt(right) == repetedChar)
						{
							result++;
							repetedChar = s.charAt(right);
							//String test = String.valueOf(s.charAt(left))+String.valueOf(currentChar)+String.valueOf(s.charAt(right));
							//System.out.println(test);
						}
						else
						{
							break;
						}
				//	}

					left--;
					right++;
				}
			}
		}
		return result;
    }


}