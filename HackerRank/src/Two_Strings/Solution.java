package Two_Strings;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
	public static String twoStrings(String s1, String s2) {
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < chars.length(); i++) 
		{
			
			if(s1.indexOf(chars.charAt(i)) > -1 && s2.indexOf(chars.charAt(i)) > -1)
			{
				return "YES";
			}
		}
		return "NO";
	}

}

