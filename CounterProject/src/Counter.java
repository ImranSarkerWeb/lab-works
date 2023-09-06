/**
 * Represents a counter with methods
 */
public class Counter {

	//instance variabels
	
	/**
	 * Stores internal count
	 */
	int count;
	
	//methods
	
	/**
	 * Increment internal count
	 * @return new value of internal count
	 */
	public int increment() {
		this.count++;
		return this.count;
	}
	
	/**
	 * Decrement internal count
	 * @return new value of internal count
	 */
	public int decrement() {
		this.count--;
		return this.count;
	}
	
	/**
	 * Returns the current value of count
	 * @return the count
	 */
	public int getCount() {
		return this.count;
	}
	
	
}
