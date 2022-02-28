package Happy_Ladybugs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Happy_Ladybugs {
    public static String happyLadybugs(String b) {
    	String test = b.replaceAll("_", "");
    	if(b.length()==1 && b.charAt(0)!='_')
    	{
    		return "NO";
    	}
    	if(test.length()==0)
    	{
    		return "YES";
    	}
    	String happyLadyBugs = "";
    	//b = b + "_";
    	char[] ladyBugs = b.toCharArray();
    	char[] temp = b.toCharArray();

    	Arrays.sort(ladyBugs);
    	if(ladyBugs[ladyBugs.length-1]!='_')
    	{
    		ladyBugs=temp;
    	}
        if(ladyBugs[0]!=ladyBugs[1]){
            return "NO";
        }
    	for (int i = 0; i < ladyBugs.length; i++) {
    		

    		if(ladyBugs[i]=='_')
    		{
    			break;
    		}
    		if(i-1<0)
    		{
    			continue;
    		}
    		if(i+1>=ladyBugs.length)
    		{
    			if(ladyBugs[i-1]!=ladyBugs[i])
    			{
    				return  "NO";
    			}	
    			continue;
    		}
			if((ladyBugs[i-1]==ladyBugs[i] || ladyBugs[i]==ladyBugs[i+1]))
			{
				
			}
			else
			{
				return  "NO";
			}

		}
		return "YES";
    // Write your code here

    }


}
