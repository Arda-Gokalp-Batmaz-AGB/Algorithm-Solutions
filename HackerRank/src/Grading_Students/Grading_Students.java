package Grading_Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grading_Students {

   public static List<Integer> gradingStudents(List<Integer> grades)
   {
	   for(int i =0;i<grades.size();i++)
	   {
		   int div = grades.get(i);
		   while(div % 5 !=0)
		   {
			   div++;
		   }
		   if(div-grades.get(i)<3 && div>=40)
		   {
			   grades.set(i, div);
		   }
	   }
  	
		return grades;
    }

}
