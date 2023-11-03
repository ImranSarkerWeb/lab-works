package lab6;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String args[]) {
		int[] numbers = { 11, 42, -5, 27, 11, 89 };
		int i, j;
		i = 0;
		j = numbers.length - 1;
		while (i < j) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
			i++;
			j--;

		}
		System.out.println("The reversed array is: " + Arrays.toString(numbers));
	}

}
