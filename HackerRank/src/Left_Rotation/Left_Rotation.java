package Left_Rotation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Left_Rotation {

	public static List<Integer> rotateLeft(int d,List<Integer> list) {
		List<Integer> newList = new ArrayList<Integer>(list);
		if(d==list.size())
		{
			return newList;
		} 
		for (int i = 0; i < list.size(); i++) {
			int index = i ;
			for (int j = 0; j < d; j++) 
			{
				index--;
				if(index<0)
				{
					index = list.size() - d + i ;
					break;
				}
			}
			newList.set(index, list.get(i));
		}
		return newList;
		// Write your code here

	}


}
