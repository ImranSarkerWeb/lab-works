package swap;

public class Swap {
	private int a;

	public Swap(int a) {
		this.a = a;
	}

	public int getValue() {
		return a;
	}

	public void setValue(int value) {
		this.a = value;
	}

	public static void main(String[] args) {
		Swap a = new Swap(10);
		Swap b = new Swap(20);

		System.out.println("Before Swap");
		System.out.println("a: " + a.getValue());
		System.out.println("b: " + b.getValue());

		swap(a, b);

		System.out.println("\nAfter Swap");
		System.out.println("a: " + a.getValue());
		System.out.println("b: " + b.getValue());
	}

	public static void swap(Swap x, Swap y) {
		int temp = x.getValue();
		x.setValue(y.getValue());
		y.setValue(temp);
	}
}
