package lab4;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Type your message/word: ");
		String message = scanner.nextLine();
		System.out.println();
		String reverseMsg = reverseMessage(message);
		System.out.println("Reversed string: " + reverseMsg);
		System.out.println();
		checkPalindrome(message);

		scanner.close();

	}

	public static String reverseMessage(String message) {
		String reverseStr = "";
		for (int i = message.length() - 1; i >= 0; i--) {
			reverseStr += message.charAt(i);
		}
		return reverseStr;
	}

	public static void checkPalindrome(String message) {

		String reversStr = reverseMessage(message);

		boolean isPalindrome = message.equalsIgnoreCase(reversStr);
		if (isPalindrome) {
			System.out.println(message + " is palindrome");
		} else {
			System.out.println(message + " is not palindrome");
		}
	}

}
