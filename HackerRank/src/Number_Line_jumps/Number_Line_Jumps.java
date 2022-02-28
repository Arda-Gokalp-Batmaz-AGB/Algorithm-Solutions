package Number_Line_jumps;

public class Number_Line_Jumps {
	
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	
		if(x2 > x1 && v2<v1 && Math.abs(x2-x1)%Math.abs(v2-v1)==0)
		{
			return "YES";
		}
		else if(x2 < x1 && v2>v1  && Math.abs(x2-x1)%Math.abs(v2-v1)==0)
		{
			return "YES";
		}
		return "NO";


    }

}
