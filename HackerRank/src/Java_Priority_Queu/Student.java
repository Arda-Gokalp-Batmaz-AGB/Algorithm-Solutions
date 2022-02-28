package Java_Priority_Queu;

public class Student implements Comparable<Student> {

	int id;
	String name;
	double cgpa;
	public Student(int id, String name, double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getCgpa() {
		return cgpa;
	}

	@Override
	public int compareTo(Student o) 
	{
		if (o == null) {
			return -1;
		}
		int c = Double.valueOf(o.getCgpa()).compareTo(Double.valueOf(cgpa));
		if (c != 0) {
			return c;
		}
		int comp = name.compareTo(o.getName());
		if(comp !=0)
		{
			return comp;
		}
		return Integer.valueOf(o.getId()).compareTo(Integer.valueOf(id));
	}

}
