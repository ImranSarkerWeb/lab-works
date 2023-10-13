package studentExample;

public class Student {


	// Attributes
	int m_age;
	double m_gpa;
	String m_name;
	// Operations
	public Student(String name,
	int age, double gpa)
	{
	m_age = age;
	m_name = name;
	m_gpa = gpa;
	}
	private void printName()
	{
	System.out.print(m_name);
	}
	public static void main(String args[])
	{
	// Create a Student instance
	Student s1 =
	new Student("Mozammel",27,1.9);
	Student s2;
	// Print the name of
	// the student
	System.out.print("Name: ");
	s1.printName();
	s2 = s1;
	// Print the same name again
	System.out.print(" Name: ");
	s2.printName();
	}
	} // End class Student