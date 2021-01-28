package kmitl.esd.exercise1.singleton;

public class CompanyManager {
	private static final CompanyManager INSTANCE = new CompanyManager();

	protected CompanyManager() {

	}

	public static CompanyManager getInstance() {
		return INSTANCE;
	}
}
