package kmitl.esd.exercise1.singleton.registry;

public class CompanyManagerRegistry {
	private static CompanyManagerRegistry INSTANCE = null;

	private ICompanyManager companyManager = null;

	private CompanyManagerRegistry() {}

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

	public Boolean register(ICompanyManager companyManager) {
		if (companyManager != null && this.companyManager != null) {
			this.companyManager = companyManager;
			return true;
		} else { return false; }
	}

	public Boolean unregister() {
		if (this.companyManager != null) {
			this.companyManager = null;
			return true;
		} else { return false; }
	}

	public static CompanyManager createCompanyManager() {
		if (CompanyManagerRegistry.getInstance().companyManager != null) {
			return null;
		}

		return new CompanyManager();
	}
}
