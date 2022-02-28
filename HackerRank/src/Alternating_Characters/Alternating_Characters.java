package Alternating_Characters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alternating_Characters {


    public static int alternatingCharacters(String s) {

       int counter = 0;
       StringBuilder str = new StringBuilder(s);
       for (int i = 0; i < str.length(); i++) 
       {
           if(i-1>=0 && str.charAt(i-1)==str.charAt(i))
           {
               //s.replace(String.valueOf(s.charAt(i)),"");
               str.deleteCharAt(i);
               i=i-1;
               counter++;
           }
       }
       return counter;
   // Write your code here

   }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			System.out.println(alternatingCharacters(s));
		}
		
		
	}

}