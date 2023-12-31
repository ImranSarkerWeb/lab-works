package gpa;

import java.util.Scanner;

public class CalculateGPAUsingSwitch {

    String name;
    int id;

    public CalculateGPAUsingSwitch(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) {
    	  
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("\nEnter your id:(integer) ");
        int id = scanner.nextInt();

        CalculateGPAUsingSwitch naserGPA = new CalculateGPAUsingSwitch(name, id);

        System.out.print("\nEnter your attendace mark:  ");
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
        switch (marks) {
            case 100:
            case 99:
            case 98:
            case 97:
            case 96:
            case 95:
            case 94:
            case 93:
            case 92:
            case 91:
            case 90:
            case 89:
            case 88:
            case 87:
            case 86:
            case 85:
            case 84:
            case 83:
            case 82:
            case 81:
            case 80:
                return "A+ and 4.0";
            case 79:
            case 78:
            case 77:
            case 76:
            case 75:
                return "A and 3.75";
            case 74:
            case 73:
            case 72:
            case 71:
            case 70:
                return "A- and 3.5";
            case 69:
            case 68:
            case 67:
            case 66:
            case 65:
                return "B+ and 3.25";
            case 64:
            case 63:
            case 62:
            case 61:
            case 60:
                return "B and 3.0";
            case 59:
            case 58:
            case 57:
            case 56:
            case 55:
                return "B- and 2.75";
            case 54:
            case 53:
            case 52:
            case 51:
            case 50:
                return "C+ and 2.5";
            case 49:
            case 48:
            case 47:
            case 46:
            case 45:
                return "C and 2.25";
            case 44:
            case 43:
            case 42:
            case 41:
            case 40:
                return "D and 2.0";
            default:
                return "F(Fail) and 0.0";
        }
    }
}
