package Sherlock_And_The_Valid_String;

import java.util.HashMap;
import java.util.Scanner;

import Forming_Magic_square.forming_magic_square;

public class Sherlock_And_The_Valid_String {


	public static String isValid(String s) {
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) 
		{
			if(!chars.containsKey(s.charAt(i)))
			{
				chars.put(s.charAt(i), 1);
			}
			else
			{
				chars.put(s.charAt(i),1+chars.get(s.charAt(i)));
			}
		}
		boolean found = false;
		boolean oneFound = false;
		int commonCount = 0;
		boolean commonTaken = false;
		for(char c : chars.keySet())
		{
			if(chars.get(c)==1)
			{
				if(oneFound==true)
					return "NO";
				oneFound=true;
			}
			else
			{
				if(commonTaken==false)
				{
					commonCount=chars.get(c);
					commonTaken=true;
				}
			}


			if(chars.get(c)!=1)
			{
				if(Math.abs(chars.get(c)-commonCount)>1)
				{
					return "NO";
				}
			}

			if(chars.get(c)!=commonCount)
			{
				if(found==true)
				{
					return "NO";
				}
				found=true;
			}
		}
		return "YES";
	}


}
