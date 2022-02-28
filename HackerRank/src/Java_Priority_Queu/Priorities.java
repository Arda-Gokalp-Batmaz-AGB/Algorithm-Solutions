package Java_Priority_Queu;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Priorities {
	public List<Student> sortStudents(List<Student> studentList)
	{
		
		return studentList;
		
	}
	public List<Student> getStudents(List<String> events)
	{
		List<Student> students = new ArrayList<>();
		for (int i = 0; i < events.size(); i++) 
		{
			if(events.get(i).contains("ENTER"))
			{
				String tempStudent = events.get(i).substring(6,events.get(i).length());
				//System.out.println(tempStudent);
				String studentName = tempStudent.substring(0,tempStudent.indexOf(" "));
				String studentGPA = tempStudent.substring(tempStudent.indexOf(" ")+1,tempStudent.lastIndexOf(" "));
				String studentID = tempStudent.substring(tempStudent.lastIndexOf(" ")+1,tempStudent.length());
				students.add(new Student(Integer.parseInt(studentID),studentName,Double.parseDouble(studentGPA)));
				
			}
			if(events.get(i).contains("SERVED") && !students.isEmpty())
			{
				Collections.sort(students);
				students.remove(0);
			}
		}
		//Collections.sort(students);
		return students;
		
	}
	   private final static Scanner scan = new Scanner(System.in);
	    private final static Priorities priorities = new Priorities();
	    
	    public static void main(String[] args) {
	        int totalEvents = Integer.parseInt(scan.nextLine());    
	        List<String> events = new ArrayList<>();
	        
	        while (totalEvents-- != 0) {
	            String event = scan.nextLine();
	            events.add(event);
	        }
	        
	        List<Student> students = priorities.getStudents(events);
	        
	        if (students.isEmpty()) {
	            System.out.println("EMPTY");
	        } else {
	            for (Student st: students) {
	                System.out.println(st.getName());
	            }
	        }
	    }

}
