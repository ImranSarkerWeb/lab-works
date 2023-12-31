package gpa;

import java.util.Scanner;

public class CalculateGPA {
	String name;
	int id;

	public CalculateGPA(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();

		System.out.print("\nEnter your id:(integer) ");
		int id = scanner.nextInt();

		CalculateGPA naserGPA = new CalculateGPA(name, id);

		System.out.print("\nEnter your attendance mark:  ");
		int attendaceMark = scanner.nextInt();

		System.out.print("\nEnter your CT mark:  ");
		int ctMark = scanner.nextInt();

		System.out.print("\nEnter your assignment mark:  ");
		int assignmentMark = scanner.nextInt();

		System.out.print("\nEnter your final mark:  ");
		int finalMark = scanner.nextInt();

		double totalPercentage = ((double) (attendaceMark + ctMark + assignmentMark + finalMark) / 100) * 100;

	
		String gpa = naserGPA.getGPA((int) totalPercentage);
		System.out.println();// blank line
		System.out.println("\t=============================");
		System.out.println();// blank line
		System.out.println("\tHi, " + name + " " + "(id: " + id + ")");
		System.out.println("\tYour obtained mark is: " + (int) totalPercentage);
		System.out.println("\tYour obtained Letter Grade and Grade Point are: " + gpa);
		System.out.println();// blank line
		System.out.println("\t=============================");
		System.out.println();// blank line

		scanner.close();
	}

	public String getGPA(int marks) {
		if (marks >= 80) {
			return "A+ and 4.0";
		} else if (marks >= 75) {
			return "A and 3.75";
		} else if (marks >= 70) {
			return "A- and 3.5";
		} else if (marks >= 65) {
			return "B+ and 3.25";
		} else if (marks >= 60) {
			return "B and 3.0";
		} else if (marks >= 55) {
			return "B- and 2.75";
		} else if (marks >= 50) {
			return "C+ and 2.5";
		} else if (marks >= 45) {
			return "C and 2.25";
		} else if (marks >= 40) {
			return "D and 2.0";
		} else {
			return "F(Fail) and 0.0";
		}
	}
}
