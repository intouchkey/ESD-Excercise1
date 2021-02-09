package kmitl.esd.exercise1.singleton.registry;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import kmitl.esd.exercise1.model.business.Company;
import kmitl.esd.exercise1.model.business.CompanyType;

class CompanyManagerTest {

	ICompanyManager companyManager = null;

	/**
	 * Prepare company manager
	 */
	@BeforeEach
	void prepareRegistration() {
		companyManager = CompanyManagerRegistry.createCompanyManager();
	}

	/**
	 * Test that the instance prepared is not null
	 */
	@Test
	void getInstance() {
		assertNotNull(companyManager);
	}

	/**
	 * Test that we are able to set companies to the company manager
	 */
	@Test
	void setCompanies() {
		List<Company> companies = new ArrayList<>();

		companies.add(Company.create(CompanyType.FOREIGN));
		companies.add(Company.create(CompanyType.LOCAL));

		companyManager.setCompanies(companies);

		assertEquals(companyManager.getCompanies(), companies);
	}
}