package kmitl.esd.exercise1.singleton.registry;

import java.util.List;

import kmitl.esd.exercise1.model.business.Company;

public interface ICompanyManager {
	List<Company> getCompanies();
	void setCompanies(List<Company> companies);
}
