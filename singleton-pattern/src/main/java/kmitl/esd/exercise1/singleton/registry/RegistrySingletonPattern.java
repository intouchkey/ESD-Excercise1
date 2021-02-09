package kmitl.esd.exercise1.singleton.registry;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import kmitl.esd.exercise1.model.business.Company;
import kmitl.esd.exercise1.model.business.CompanyType;

public class RegistrySingletonPattern {
	/**
	 * A main function for showing that the implementation works
	 *
	 * @return void
	 */
	public static void main(String args[]) {
		CompanyManagerRegistry registry = CompanyManagerRegistry.getInstance();
		registry.register(CompanyManagerRegistry.createCompanyManager());

		ICompanyManager companyManager = registry.getCompanyManager();

		List<Company> companies = new ArrayList<>();

		companies.add(Company.create(CompanyType.FOREIGN));
		companies.add(Company.create(CompanyType.LOCAL));

		companyManager.setCompanies(companies);

		Logger.getLogger(RegistrySingletonPattern.class.getName()).info(companyManager.getCompanies().toString());
	}
}
