/**
 * Represent a person
 * @author Imran
 */
public class Person {

	//instance variables
	
	String name;
	int age;
	
	/**
	 * Creates a person with given name and age
	 * @param name of person
	 * @param age of person
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Compares instances of person based on name.
	 * If two people have the same name, they are equal.
	 */
	public boolean equals(Object something) {
		//cast given object to Person
		Person otherPerson = (Person) something;
		
		//Returns true if names of two people are the same
		return this.name.equals(otherPerson.name);
	}
}
