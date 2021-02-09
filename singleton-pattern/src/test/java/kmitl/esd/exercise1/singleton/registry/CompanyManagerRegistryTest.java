package kmitl.esd.exercise1.singleton.registry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CompanyManagerRegistryTest {
	CompanyManagerRegistry companyManagerRegistry;

	/**
	 * Prepare company manager registry
	 */
	@BeforeEach
	void prepareCompanyManagerRegistry() {
		this.companyManagerRegistry = CompanyManagerRegistry.getInstance();
	}

	/**
	 * Test that the instance prepared is not null
	 */
	@Test
	void getInstance() {
		assertNotNull(companyManagerRegistry);
	}

	/**
	 * Test that we are able to register company manager to company manager registry
	 */
	@Test
	void register() {
		boolean ok = companyManagerRegistry.register(CompanyManagerRegistry.createCompanyManager());

		assertTrue(ok);
		assertNotNull(companyManagerRegistry.getCompanyManager());

		companyManagerRegistry.unregister();
	}

	/**
	 * Test that we are unable to register company manager when it's already registered
	 */
	@Test
	void registerMultipleTimes() {
		companyManagerRegistry.register(CompanyManagerRegistry.createCompanyManager());
		boolean ok = companyManagerRegistry.register(CompanyManagerRegistry.createCompanyManager());

		assertFalse(ok);
	}

	/**
	 * Test that we are able to unregister company manager to company manager registry
	 */
	@Test
	void unregister() {
		companyManagerRegistry.register(CompanyManagerRegistry.createCompanyManager());
		boolean ok = companyManagerRegistry.unregister();

		assertEquals(ok, true);
		assertNull(companyManagerRegistry.getCompanyManager());
	}

	/**
	 * Test that we are able to create company manager
	 */
	@Test
	void createCompanyManager() {
		ICompanyManager companyManager = CompanyManagerRegistry.createCompanyManager();

		assertNotNull(companyManager);
	}

	/**
	 * Test that we are unable to create company manager when there is one that is registered
	 */
	@Test
	void createCompanyManagerWhenRegistered() {
		companyManagerRegistry.register(CompanyManagerRegistry.createCompanyManager());
		ICompanyManager companyManager = CompanyManagerRegistry.createCompanyManager();

		assertNull(companyManager);
	}
}