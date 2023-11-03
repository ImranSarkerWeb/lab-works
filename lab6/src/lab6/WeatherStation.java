package lab6;

import java.util.*;

public class WeatherStation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many days' temperatures? ");
		int days = scanner.nextInt();
		int[] temperatures = new int[days];
		int sum = 0;
		for (int i = 0; i < days; i++) {
			System.out.print("Day " + (i + 1) + "'s high temp: ");
			temperatures[i] = scanner.nextInt();
			sum += temperatures[i];
		}
		double average = (double) sum / days;
		int count = 0;
		for (int i = 0; i < days; i++) {
			if (temperatures[i] > average) {
				count++;
			}
		}
		scanner.close();
		System.out.println("\nAll temperatures: " + Arrays.toString(temperatures));
		System.out.printf("Average temp = %.1f\n", average);
		System.out.println(count + " days were above average.");
		Arrays.sort(temperatures);
		System.out.printf("Two coldest days : %d, %d\n", temperatures[0], temperatures[1]);
		System.out.printf("Two hottest days : %d, %d\n", temperatures[days - 1], temperatures[days - 2]);

	}
}