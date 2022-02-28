package breaking_the_Records;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class breaking_the_Records {
	
    static List<Integer> breakingRecords(List<Integer> scores) {
    	int max = scores.get(0);
    	int min = scores.get(0);
    	int maxcounter=0;
    	int mincounter=0;
    	for(int i =1;i<scores.size();i++)
    	{
    		if(max < scores.get(i))
    		{
    			max = scores.get(i);
    			maxcounter++;
    		}
    		if(min > scores.get(i))
    		{
    			min = scores.get(i);
    			mincounter++;
    		}
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(maxcounter);
    	list.add(mincounter);
		return list;


    }


}
