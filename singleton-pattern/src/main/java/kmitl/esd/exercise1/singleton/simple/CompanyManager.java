package kmitl.esd.exercise1.singleton.simple;

/**
 * A company manager that uses the singleton pattern
 */
public class CompanyManager {

	private static final CompanyManager INSTANCE = new CompanyManager();

	/**
	 * A private constructor to ensure that other classes cannot create new company managers
	 *
	 * @return void
	 */
	private CompanyManager() {}

	/**
	 * A function to get the instance CompanyManager
	 *
	 * @return INSTANCE the singleton instance CompanyManager
	 */
	public static CompanyManager getInstance() {
		return INSTANCE;
	}
}
