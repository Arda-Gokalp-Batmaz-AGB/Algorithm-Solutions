package AppendAndDelete;

import java.util.Scanner;

public class Append_Delete {

	static String appendAndDelete(String s, String t, int k) 
	{
		int opCounter = 0;
		boolean del = false;
		boolean ok = false;
		if(s.length()<t.length() && k-(s.length())>0)
		{
			k = k-(s.length());
			s = "";
			ok = true;
			del = true;
		}
		while(opCounter<k)
		{
			if((((t.contains(s) && s.length()!=1) || ok == true ) || s.equals(" ") || s.equals("")) && del==true)
			{
				for(int i = s.length();i<t.length();i++)
				{
					s = s + t.charAt(i);
					opCounter++;
					if(opCounter==k)
					{
						break;
					}
					
				}
			}
			else
			{
				opCounter++;
				s = s.substring(0, s.length()-1);
				del = true;
			}
			if(s.equals(t))
			{
				break;
			}
		}
		if(s.equals(t))
		{
			return "Yes";
		}
		return "No";


	}
	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
		String s = STDIN.next();
		String t = STDIN.next();
		int k = STDIN.nextInt();
		System.out.println(appendAndDelete(s,t,k));

	}

}