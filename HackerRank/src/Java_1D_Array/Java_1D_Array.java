package Java_1D_Array;

import java.util.Scanner;

public class Java_1D_Array {

    public static boolean canWin(int leap, int[] game) {
    	int Index = 0;
    	if(leap >= game.length -1)
    		return true;
    	
    	while(true)
    	{
    		if(game[Index] == 1)
    		{
    			Index--;
    			if(Index + leap > game.length-1)
    			{
    				return true;
    			}
    			
    			
    			if(game[Index + leap] == 0)
    			{
    				Index = Index + leap;
    			}
    			else if (game[Index + leap] == 1)
    			{
    				return false;
    			}

    		}
    		
    		if(game[Index] == 0)
    		{
    			Index++;
    		}
    		if(Index > game.length-1)
    		{
    			return true;
    		}

    	}

        // Return true if you can win the game; otherwise, return false.
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

}
