package kmitl.esd.exercise1.singleton.registry;

public class CompanyManagerRegistry {
	private static CompanyManagerRegistry INSTANCE = null;

	private ICompanyManager companyManager = null;

	/**
	 * Private constructor for company manager registry -> Simple singleton pattern
	 */
	private CompanyManagerRegistry() {}

	/**
	 * A function for getting the instance of company manager registry
	 * Simple singleton
	 *
	 * @return company manager registry
	 */
	public static CompanyManagerRegistry getInstance() {
		if (INSTANCE == null) {
			synchronized (CompanyManagerRegistry.class) {
				if (INSTANCE == null) {
					INSTANCE = new CompanyManagerRegistry();
				}
			}
		}

		return INSTANCE;
	}

	/**
	 * A function for registering a company manager to the registry
	 * Registering is not possible, if a company manager is already registered or the new company manager is null
	 *
	 * @return boolean status of register
	 */
	public Boolean register(ICompanyManager companyManager) {
		if (companyManager != null && this.companyManager == null) {
			this.companyManager = companyManager;
			return true;
		} else { return false; }
	}

	/**
	 * A function for unregistering the company manager that is registered
	 * Unregistering is not possible, if there are currently no registered company manager in the registry
	 *
	 * @return boolean status of unregister
	 */
	public Boolean unregister() {
		if (this.companyManager != null) {
			this.companyManager = null;
			return true;
		} else { return false; }
	}

	/**
	 * A method for getting company manager registered in the registry
	 *
	 * @return company manager or null
	 */
	public ICompanyManager getCompanyManager() {
		return companyManager;
	}

	/**
	 * A factory method for creating a company manager
	 * Creating a new company manager is not possible if company manager is already registered
	 *
	 * @return company manager or null
	 */
	public static CompanyManager createCompanyManager() {
		if (CompanyManagerRegistry.getInstance().companyManager != null) {
			return null;
		}

		return new CompanyManager();
	}
}
