package kmitl.esd.exercise1.model.business;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ForeignCompanyTest {

	private static ForeignCompany foreignCompany;

	/**
	 * Prepare foreign company for testing
	 */
	@BeforeEach
	void setup() {
		foreignCompany = new ForeignCompany();
	}

	/**
	 * Test that the company type is correct
	 */
	@Test
	void getCompanyType() {
		assertEquals(foreignCompany.getCompanyType(), CompanyType.LOCAL);
	}
}