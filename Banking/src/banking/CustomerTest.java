package banking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {

	Customer customer;
	@BeforeEach
	void setUp() throws Exception {
		this.customer = new Customer("Imran");
	}

	@Test
	void testSetAddress() {
		//confirms the initial value of address is null
		assertNull(this.customer.getAddress());
		
		//sets address for customer
		this.customer.setAddress("Dhaka, BD");
		// checks that address was set correctly
		assertEquals("Dhaka, BD", this.customer.getAddress());
		
		//reset address for customer
		this.customer.setAddress("Bogra, BD");
		//checks that address was reset correctly
		assertEquals("Bogra, BD", this.customer.getAddress());
	}

}
