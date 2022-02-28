package Mark_And_Toys;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Mark_And_Toys {


    public static int maximumToys(List<Integer> prices, int m) {
    	Collections.sort(prices);
    	int counter = 0;
    	int tempMoney = 0;
    	for (int i = 0; i < prices.size(); i++) {
			if(prices.get(i)+tempMoney<m)
			{
				tempMoney = tempMoney+prices.get(i);
				counter++;
			}
		}
		return counter;
    // Write your code here

    }

}
