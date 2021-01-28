package kmitl.esd.exercise1.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompanyManagerTest {
	@Test
	void getInstance() {
		assertNotEquals(CompanyManager.getInstance(), null);
	}
}