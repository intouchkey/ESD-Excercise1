package kmitl.esd.exercise1.model.business;

public class LocalCompany extends Company {

	/**
	 * method for getting company type
	 *
	 * @return company type
	 */
	public CompanyType getCompanyType() {
		return CompanyType.LOCAL;
	}

	/**
	 * method for getting company name
	 *
	 * @return name
	 */
	public String getName() {
		return "Local Comp." + name;
	}
}
