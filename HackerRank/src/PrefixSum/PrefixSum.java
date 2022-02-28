package PrefixSum;

import java.util.Scanner;

public class PrefixSum {

	public static int calculateSum(int a,int b,int[]array)
	{
		//int sum = 0;
		if(a==0)
			return array[b];

		return array[b] - array[a-1];
	}
	public static void main(String[] args) {
		int[] array = {6,3,-2,4,-1,0,-5};
		
		for (int i = 1; i < array.length; i++) {
			array[i] += array[i-1];
		}
		
		System.out.println("Calculate the sum between [a,b]");
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = inp.nextInt();
		System.out.println("Enter b:");
		int b = inp.nextInt();
		
		System.out.println(calculateSum(a, b, array));
	}

}
