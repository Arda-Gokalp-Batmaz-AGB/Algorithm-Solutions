package flatland_space_stations;

import java.util.Arrays;
import java.util.Scanner;


public class flatland_space_stations {


	public static int flatlandSpaceStations(int cityCount, int[] situations)
	{
		int maxDistance = 0;
		
		for (int i = 0; i < cityCount; i++) 
		{
			int nearestDistance = cityCount;
			
			for (int j = 0; j < situations.length; j++) 
			{
				int temp = Math.abs(i-situations[j]);
				if(nearestDistance>temp)
				{
					nearestDistance=temp;
				}
			}
			if(nearestDistance>maxDistance)
			{
				maxDistance=nearestDistance;
			}
            if(maxDistance>=cityCount)
            {
                break;
            }
		}
		return maxDistance;
		
	}

}
