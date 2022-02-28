package Sorting_Comparetor;

import java.util.Comparator;

public class Checker implements Comparator<Player> {

	@Override
	public int compare(Player a, Player b) {
		//int comp = compare(a, b);
		if(a.score>b.score)
		{
			return -1;
		}
		else if (b.score>a.score)
		{
			return 1;
		}

		return a.name.compareTo(b.name);

	}

}
