package CircularArrayNotation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CircularArrayNotation {
	
    static ArrayList<Integer> circularArrayRotation(ArrayList<Integer> arr, int k, ArrayList<Integer> query) {

    	
    	for(int i = 0 ; i < k ; i++)
    	{
    		int temp = arr.get(arr.size()-1);
    		arr.remove(arr.size()-1);
    		arr.add(0,temp);
    	}
    	for(int i = 0;i<query.size();i++)
    	{
    		query.set(i, arr.get(query.get(i)));
    	}
		return query;


    }
	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
		int n = STDIN.nextInt();
		int k = STDIN.nextInt();
		int q = STDIN.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>( );
		ArrayList<Integer> query = new ArrayList<Integer>( );

		for(int i = 0 ;i<n;i++)
		{
			int t = STDIN.nextInt();
			arr.add(t);
		}
		for(int i = 0 ;i<q;i++)
		{
			int t = STDIN.nextInt();
			query.add(t);
		}
		ArrayList<Integer> r = circularArrayRotation(arr,k,query);
		for(int i = 0 ; i<r.size() ; i++)
		{
			System.out.println(r.get(i));
		}

	}

}