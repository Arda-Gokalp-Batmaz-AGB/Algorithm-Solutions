package ACM_ICPC_Team;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ACM_ICPC_Team {
	
	   static int[] acmTeam(String[] topic,int n,int m) {
		   int max = 0;
		   int result[] = new int[2];
			ArrayList<Integer> tempor = new ArrayList<Integer>( );
		   for(int i = 0; i<n ; i++)
		   {
			   String temp = "";
			   for(int g = i ; g<n; g++)
			   	{
				   
			   
			   int counter=0;
			   for(int z = 0 ; z<m; z++)
			   {
				   
				   if(z+1>=m && i+1>=n)
					   break;
				   if(topic[i].charAt(z)=='1' || topic[g].charAt(z)=='1')
				   {
					   counter++;
				   }

			   }
			   if(counter>=max)
			   {
				   max = counter;
				   tempor.add(counter);
			   }
			   	}
		   }
		  
		   Collections.sort(tempor, Collections.reverseOrder());
		   result[0]=max;
		   result[1]=0;
		   for(int i = 0; i<tempor.size();i++)
		   {
			   if(tempor.get(i)==max)
			   result[1] = result[1] + 1;
		   }
		return result;


	    }


	    
	public static void main(String[] args) throws IOException {
		Scanner STDIN = new Scanner(System.in);

	        String[] nm = STDIN.nextLine().split(" ");

	        int n = Integer.parseInt(nm[0]);

	        int m = Integer.parseInt(nm[1]);

	        String[] topic = new String[n];

	        for (int i = 0; i < n; i++) {
	            String topicItem = STDIN.nextLine();
	            topic[i] = topicItem;
	        }

	        int[] result = acmTeam(topic,n,m);
	        System.out.println(result[0]);
	        System.out.println(result[1]);
	    }

	}
