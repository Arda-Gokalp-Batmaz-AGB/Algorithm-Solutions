package Strings_Making_Anagrams;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class Result {

	/*
	 * Complete the 'makeAnagram' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts following parameters:
	 *  1. STRING a
	 *  2. STRING b
	 */

	public static int makeAnagram(String a, String b) {
		HashMap<Character, Integer> mapA = new HashMap<Character, Integer>();
		HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();
		int deletionCount = 0;
		for (int i = 0; i < a.length(); i++) {
			char current = a.charAt(i);
			if(mapA.containsKey(current))
			{
				mapA.put(current, mapA.get(current)+1);
			}
			else
			{
				mapA.put(current, 1);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			char current = b.charAt(i);
			if(mapB.containsKey(current))
			{
				mapB.put(current, mapB.get(current)+1);
			}
			else
			{
				mapB.put(current, 1);
			}
		}
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < alphabet.length(); i++) {
			char currentChar = alphabet.charAt(i);

			if(!mapA.containsKey(currentChar) && !mapB.containsKey(currentChar))
				continue;

			if(mapA.containsKey(currentChar) && mapB.containsKey(currentChar))
			{
				if(mapA.get(currentChar) != mapB.get(currentChar))
				{
					int diff = Math.abs(mapA.get(currentChar)-mapB.get(currentChar));
					deletionCount += diff;
				}
			}
			else if(mapA.containsKey(currentChar))
			{
				deletionCount += mapA.get(currentChar);
			}
			else if(mapB.containsKey(currentChar))
			{
				deletionCount += mapB.get(currentChar);
			}
		}

		return deletionCount;
		// Write your code here

	}

}
