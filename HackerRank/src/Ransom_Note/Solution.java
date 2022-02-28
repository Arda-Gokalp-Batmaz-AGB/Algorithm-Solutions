package Ransom_Note;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;


class Result {

    public static void checkMagazine(List<String> magazine, List<String> note) 
    {
    	Hashtable<String, Integer> tableMagazine = new Hashtable<String,Integer>();
    	Hashtable<String, Integer> tableNote = new Hashtable<String,Integer>();
    	for (int i = 0; i < magazine.size(); i++) {
			
    		if(!tableMagazine.containsKey(magazine.get(i)))
    		{
    			tableMagazine.put(magazine.get(i), 1);
    		}
    		else
    		{
    			tableMagazine.put(magazine.get(i), tableMagazine.get(magazine.get(i))+1);
    		}
		}
    	for (int i = 0; i < note.size(); i++) {
			
    		if(!tableNote.containsKey(note.get(i)))
    		{
    			tableNote.put(note.get(i), 1);
    		}
    		else
    		{
    			tableNote.put(note.get(i), tableNote.get(note.get(i))+1);
    		}
		}
    	
    		for (String key : tableNote.keySet()) 
    		{
				if(!tableMagazine.containsKey(key))
				{
					System.out.println("No");
					return;
				}
				else
				{
					if(tableMagazine.get(key) >= tableNote.get(key))
					{
						continue;
					}
					else
					{
						System.out.println("No");
						return;
					}
				}
			}
    		System.out.println("Yes");
    	
    }

}

