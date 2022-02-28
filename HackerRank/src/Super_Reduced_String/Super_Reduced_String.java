package Super_Reduced_String;

import java.util.Scanner;

public class Super_Reduced_String {
	
    static String superReducedString(String s) {
    	char frst = s.charAt(0);
    	for(int i = 1 ; i<s.length() ; i++)
    	{
    		frst = s.charAt(i-1);
    		char temp = s.charAt(i);
    		if(s.charAt(i) == frst)
    		{
    			s= s.replace(String.valueOf(s.charAt(i)+String.valueOf(s.charAt(i-1))), "");
    			i = 0;
    		}
    	}
    	if(s.equals("") || s.equals(" "))
    	{
    		return "Empty String";
    	}
		return s;


    }

}

