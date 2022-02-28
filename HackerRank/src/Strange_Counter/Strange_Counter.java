package Strange_Counter;

import java.util.Scanner;

public class Strange_Counter {
	public static long strangeCounter (long time)
	{
		long strangeTime = 3;
		long tempTime = 0;
		while(true)
		{

			if(time>strangeTime && time>=strangeTime*2)
			{
				strangeTime=strangeTime*2;
				
			}
			else
			{
				if(strangeTime==time)
				{
					strangeTime=time-2;
					break;
				}
				tempTime=strangeTime-2;
				strangeTime=strangeTime-(time-tempTime);
				if(strangeTime==0)
				{
					strangeTime = time + 2;
				}
				break;
			}
		}
		return strangeTime;
	}

}

