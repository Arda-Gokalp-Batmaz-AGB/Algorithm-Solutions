package pickingNumbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class picking_numbers {
	
    public static int pickingNumbers(List<Integer> array) {
    	Collections.sort(array);
    	int result = 0;
    	int pass = 0;
    	ArrayList<Integer> resultArray = new ArrayList<Integer>();
    	for(int i = 0 ;i <array.size() ; i++) 
    	{
    		//ArrayList<Integer> tempArray = new ArrayList<Integer>(array);
    		int tempInt = array.get(i);
        	for(int z = 0 ;z<array.size() ; z++) 
        	{
        		if(tempInt-array.get(z)==-1 && (pass==0 || pass==1))
        		{
        			resultArray.add(array.get(z));
        			pass=1;
        		}
      
        		if((tempInt-array.get(z))==1 && (pass==0 || pass==2))
        		{
        			resultArray.add(array.get(z));
        			pass=2;
        		}
        		if(Math.abs(tempInt-array.get(z))==0)
        		{
        			resultArray.add(array.get(z));
        		}
        	}
        	pass=0;
        	Collections.sort(resultArray);
        //	System.out.println(resultArray);
        	if(resultArray.size()>result)
        		result = resultArray.size();
        	resultArray.clear();
    	}
		return result;
		
    // Write your code here

    }
}
