package Two_Characters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Two_Characters {

	public static int alternate(String s) {
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if(!list.contains(s.charAt(i)))
			{
				list.add(s.charAt(i));
			}
		}
		
		int max = 0;
		for (int i = 0; i < list.size(); i++) 
		{
			char char_1 = list.get(i);
			for (int j = i+1; j < list.size(); j++) 
			{
				char char_2 = list.get(j);
				int lastchar = '.';
				String tempS = "";
				for (int k = 0; k < s.length(); k++) 
				{
					if(s.charAt(k)==char_1)
					{
						tempS = tempS + char_1;
					}
					if(s.charAt(k)==char_2)
					{
						tempS = tempS + char_2;
					}
				}
				boolean possible = true;
				for (int k = 1; k < tempS.length(); k++) 
				{
					if(tempS.charAt(k)==tempS.charAt(k-1))
					{
						possible = false;
						break;
					}
				}
				if(possible==true)
				{
					//System.out.println(tempS);
					if(tempS.length()>max)
					{
						max = tempS.length();
					}
				}
				
			}
		}
		return max;
		// Write your code here

	}


}
