package kmitl.esd.exercise1.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerTest {

	/**
	 * Test that we can get the instance CompanyManager and it's not null
	 */
	@Test
	void getInstance() {
		assertNotEquals(CompanyManager.getInstance(), null);
	}

	/**
	 * Test that we always get the same instance of CompanyManager
	 */
	@Test
	void getMultipleInstance() { assertEquals(CompanyManager.getInstance(), CompanyManager.getInstance()); }
}