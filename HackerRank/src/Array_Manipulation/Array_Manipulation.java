package Array_Manipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array_Manipulation {
	static long[] array;
	//static int mainSum = 0;
	public static void arrayManipulation(int n, List<Integer> query) 
	{
		array[query.get(0)] = array[query.get(0)] + query.get(2);
		array[query.get(1)] = array[query.get(1)] - query.get(2);
	}
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int n = inp.nextInt();
		int m = inp.nextInt();
		array = new long[n+1];
		for (int i = 0; i < m; i++) {
			int a = inp.nextInt();
			int b = inp.nextInt();
			int k = inp.nextInt();
			List<Integer> temp = new ArrayList<>();
			temp.add(a-1);
			temp.add(b);
			temp.add(k);
			arrayManipulation(n,temp);

		}
        long sum = 0;
        long max = 0;
        for (int i = 0; i < array.length; i++) {


            sum += array[i];
            max = Math.max(max, sum);
        }
		System.out.println(max);
	}

}
