package kmitl.esd.exercise1.singleton.registry;

import java.util.ArrayList;
import java.util.List;

import kmitl.esd.exercise1.model.business.Company;

/**
 * package private concrete class for the CompanyManager
 */
class CompanyManager implements ICompanyManager {
	protected List<Company> companies = new ArrayList<>();

	public CompanyManager() {}

	/**
	 * A function to get the companies that are managed by Company Manager
	 *
	 * @return companies list of companies
	 */
	public List<Company> getCompanies() { return companies; }

	/**
	 * A function to add new companies to be managed by Company Manager
	 *
	 * @return void
	 */
	public void setCompanies(List<Company> companies) { this.companies = companies; }
}
