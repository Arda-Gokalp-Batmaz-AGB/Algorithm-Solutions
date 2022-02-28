package Merge_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge_Sort {

	public static long countInversions(List<Integer> arr) 
	{
		int counter = 0;
		for (int i = 0; i < arr.size()-1; i++)
			for (int j = 0; j < arr.size()-i-1; j++)
				if (arr.get(j) > arr.get(j+1))
				{
					// swap arr[j+1] and arr[j]
					int temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
					counter++;
				}
		return counter;
	}
	public static void merge(
			  int[] a, int[] l, int[] r, int left, int right) {
			 
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			        if (l[i] <= r[j]) {
			            a[k++] = l[i++];
			        }
			        else {
			            a[k++] = r[j++];
			        }
			    }
			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }
			}
	public static void mergeSort(int[] a, int n) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    int[] l = new int[mid];
	    int[] r = new int[n - mid];

	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid);
	    mergeSort(r, n - mid);

	    merge(a, l, r, mid, n - mid);
	}	

}
