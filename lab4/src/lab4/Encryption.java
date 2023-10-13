package lab4;

import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your message: ");
		String msg = sc.nextLine();
		System.out.print("Enter your key: ");
		int key = sc.nextInt();
		String encrytedMessage = encryptedMsg(msg, key);
		System.out.print("\nYour encrypted message: ");
		System.out.println(encrytedMessage);

		sc.close();

	}

	public static String encryptedMsg(String message, int shifKey) {
		String encrypted = "";
		for (int i = 0; i < message.length(); i++) {
			char ch = message.charAt(i);
			if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z') {
				ch = (char) (message.charAt(i) + shifKey);
				if (ch > 'z') {
					ch = (char) (ch - 'z' + 'a' - 1);
				}
				encrypted += ch;
			} else if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
				ch = (char) (message.charAt(i) + shifKey);
				if (ch > 'Z') {
					ch = (char) (ch - 'Z' + 'A' - 1);
				}
				encrypted += ch;

			} else {
				encrypted += ch;
			}
		}
		return encrypted;
	}

}
