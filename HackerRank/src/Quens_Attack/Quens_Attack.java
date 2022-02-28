package Quens_Attack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quens_Attack {
	public static int obstacleCounter = 0;
	
	public static int queensAttack(int n, int k, int r_q, int c_q, List<List<Integer>> obstacles) {
		//int[][] board = new int[n][n];
		//n = n -1;
		//board[r_q][c_q] = 1;
		int counter = 0 ;
		int up  = n - r_q;
		int down  = r_q - 1;
		int right  = n - c_q;
		int left  = c_q - 1;
		int right_up = n - Math.max(r_q, c_q);
		int right_down = Math.min(r_q - 1, n - c_q);
		int left_up = Math.min(n - r_q,c_q - 1);
		int left_down = Math.min(r_q - 1, c_q - 1);
		List<Integer> list = new ArrayList<Integer>(8);
		//row -
		for (int i = 0; i < obstacles.size(); i++) 
		{
			int tempR = obstacles.get(i).get(0);
			int tempC = obstacles.get(i).get(1);
			if(tempC==c_q && tempR>r_q)
			{
				up = Math.min(up, tempR - r_q - 1);
			}
			if(tempC==c_q && tempR<r_q)
			{
				down = Math.min(down, r_q - tempR -  1);
			}
			if(tempR==r_q && tempC>c_q)
			{
				right = Math.min(right, tempC - c_q - 1);
			}
			if(tempR==r_q && tempC<c_q)
			{
				left = Math.min(left,  c_q- tempC- 1);
			}
			
			if(tempC>c_q && tempR>r_q && tempR - r_q ==tempC - c_q)
			{
				right_up = Math.min(right_up,tempR-r_q-1);
			}
			
			if(tempC>c_q && tempR<r_q && r_q - tempR ==tempC - c_q)
			{
				right_down = Math.min(right_up,r_q - tempR - 1);
			}
			
			if(tempC<c_q && tempR>r_q && tempR - r_q ==c_q - tempC)
			{
				left_up = Math.min(right_up,tempR-r_q-1);
			}
			
			if(tempC<c_q && tempR<r_q &&   r_q - tempR==c_q - tempC )
			{
				left_down = Math.min(right_up,r_q - tempR - 1);
			}
		}
		counter = up + down + right + left + right_up + right_down + left_up + left_down;
		for (int i = 0; i < list.size(); i++) {
			counter = counter + list.get(i);
		}
		return counter;
		// Write your code here

	}
	public static boolean checkIfLoopIsValid(List<List<Integer>> obstacles, int row, int column)
	{
		if(obstacleCounter>=8)
		{
			return false;
		}
		boolean endLoop = false ;
		for (int z = 0; z < obstacles.size(); z++) 
		{
			int tempR = obstacles.get(z).get(0);
			int tempC = obstacles.get(z).get(1);
			if(tempR == row && tempC == column)
			{
				endLoop=true;
				obstacleCounter++;
				break;
			}
		}
		return endLoop;
		
	}

}
