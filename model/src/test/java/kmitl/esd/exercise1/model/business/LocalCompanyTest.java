package kmitl.esd.exercise1.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LocalCompanyTest {

	private static LocalCompany localCompany;

	/**
	 * Prepare local company for testing
	 */
	@BeforeEach
	void setup() {
		localCompany = new LocalCompany();
	}

	/**
	 * Test that the company type is correct
	 */
	@Test
	void getCompanyType() {
		assertEquals(localCompany.getCompanyType(), CompanyType.LOCAL);
	}
}