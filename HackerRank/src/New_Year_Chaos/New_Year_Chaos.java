package New_Year_Chaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class New_Year_Chaos {

    public static void minimumBribes(List<Integer> list) {
    	int counter = 0;


        for (int i=list.size(); i >=1; i--) {

			if(list.get(i-1)-i>2)
			{
				System.out.println("Too chaotic");
				counter=0;
				break;
			}
			for (int j=i-2;j>=Math.max(list.get(i-1)-2,0);j--) 
			{
				if(list.get(j)>list.get(i-1))
				{
					counter++;
				}
			}
		}
        if(counter!=0)
        System.out.println(counter);
    }
    


}

