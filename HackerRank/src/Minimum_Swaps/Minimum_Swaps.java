package Minimum_Swaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Minimum_Swaps {

	static int minimumSwaps(int[] arr) 
	{
		int counter = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]-1!=i)
			{
				for (int j = i; j < arr.length; j++) {
					if(arr[j]-1==i)
					{
						int tempi = arr[i];
						arr[i]= arr[j];
						arr[j]=tempi;
						counter++;
						break;
					}
				}
			}
		}
		return counter;
	}


}
