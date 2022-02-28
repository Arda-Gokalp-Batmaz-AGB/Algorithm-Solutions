package Encryption;

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
	
    static String encryption(String s) {
    	s =s.replaceAll(" ","");
    	double size = Math.sqrt(s.length());
    	int row = (int) Math.floor(size);
    	int column = (int) Math.ceil(size);

    	if(row*column<s.length())
    	{
    		row = column;
    	}
    	String[]data = new String[row];
    	char[][] depo = new char[row][column];
    	int sit = 0;
    	int cut = column;
    	String result = "";

    	for(int i = 0 ; i<row ; i++)
    	{
    		
    		for(int z = 0 ; z<column ; z++)
    		{
    			if(s.length()<=sit+z)
    			{
    				break;
    			}
    			char temp = s.charAt(z+sit);
    			depo[i][z]= temp;
    		}
    		sit = sit + column;

    	}

    	String[] test = new String[column];
    	for(int i = 0 ; i<column ; i++)
    	{
        	for(int z = 0 ; z<row ; z++)
        	{
        		char temp = depo[z][i];
        		if(temp!=' ')
        		{
            		result = result + temp;
           // 		System.out.print(temp);
            		if(test[i]==null)
            		{
            			test[i]="";
            		}
            		test[i]=test[i]+temp;
        		}

        	}
        //	System.out.print(" ");
        	result = result + " ";
    	}
    	//System.out.println();
    	result = "";
    	for(int i = 0; i<test.length;i++)
    	{
    	//	System.out.print(test[i].trim());
    	//	System.out.print(" ");
    		result = result + test[i].trim();
    		result = result + " ";
    	}
    	
    	result = result.substring(0, result.length()-1);
    	//System.out.println();
    	//System.out.println(Arrays.toString(test));
		return result;


    }
	public static void main(String[] args) {
		Scanner STDIN = new Scanner(System.in);
		String s = STDIN.nextLine();
		System.out.println(encryption(s));

	}

}
