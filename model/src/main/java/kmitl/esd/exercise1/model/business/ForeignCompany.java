package kmitl.esd.exercise1.model.business;

public class ForeignCompany extends Company{

	/**
	 * method for getting company type
	 *
	 * @return company type
	 */
	public CompanyType getCompanyType() {
		return CompanyType.FOREIGN;
	}

	/**
	 * method for getting company name
	 *
	 * @return name
	 */
	public String getName() {
		return "Foreign Comp." + name;
	}
}
