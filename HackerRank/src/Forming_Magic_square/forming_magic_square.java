package Forming_Magic_square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class forming_magic_square {
	public static ArrayList<int[][]> createMagic()
	{
    	ArrayList<int[][]> arlist = new ArrayList<int[][]>( );
    	int[][] a = {
    		      {8, 1, 6}, 
    		      {3, 5, 7}, 
    		      {4, 9, 2}, };
    	int[][] b = {
  		      {6, 1, 8}, 
  		      {7, 5, 3}, 
  		      {2, 9, 4}, };
    	int[][] c = {
  		      {4, 9, 2}, 
  		      {3, 5, 7}, 
  		      {8, 1, 6}, };
    	int[][] d = {
  		      {2, 9, 4}, 
  		      {7, 5, 3}, 
  		      {6, 1, 8}, };
    	int[][] e = {
  		      {8, 3, 4}, 
  		      {1, 5, 9}, 
  		      {6, 7, 2}, };
    	int[][] g = {
  		      {4, 3, 8}, 
  		      {9, 5, 1}, 
  		      {2, 7, 6}, };
    	int[][] f = {
  		      {6, 7, 2}, 
  		      {1, 5, 9}, 
  		      {8, 3, 4}, };
    	int[][] z = {
  		      {2, 7, 6}, 
  		      {9, 5, 1}, 
  		      {4, 3, 8}, };
    	arlist.add(a);
    	arlist.add(b);
    	arlist.add(c);
    	arlist.add(d);
    	arlist.add(e);
    	arlist.add(g);
    	arlist.add(f);
    	arlist.add(z);
    	return arlist;
	}
    static int formingMagicSquare(List<List<Integer>> s) {
    	ArrayList<int[][]> arlist = createMagic();
    	int minCost = 100000;
    	for(int i =0;i<arlist.size();i++)
    	{
    		int[][] temp = arlist.get(i);
    		int cost = 0;
        	for(int k =0;k<3;k++)
        	{
            	for(int z =0;z<3;z++)
            	{
            		if(temp[k][z]!=s.get(k).get(z))
            		{
            			cost = cost + Math.abs(s.get(k).get(z)-temp[k][z]);
            		}
            	}
        	}
        	if(cost<minCost)
        	{
        		minCost=cost;
        	}
    	}
		return minCost;


    }


}
