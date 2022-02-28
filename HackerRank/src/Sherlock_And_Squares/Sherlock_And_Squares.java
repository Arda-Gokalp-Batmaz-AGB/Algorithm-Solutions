package Sherlock_And_Squares;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sherlock_And_Squares {

    public static int squares(int a, int b) {
    	int counter = 0;
    	for (int i = a; i <= b; i++) 
    	{
    		double temp = (i);
    		if (Math.sqrt(temp) == (int)Math.sqrt(temp))
    		{
    			counter++;
    			while(true)
    			{
        			int increase = (int) (3 + 2*(Math.sqrt(temp) -1 ));

        			temp = increase + temp;
        			if(temp>b)
        			{
        				break;
        			}
        			counter++;
				}

    		   break;//counter++;
    		}
		}
    	
		return counter;
    // Write your code here

    }


}
