package kmitl.esd.exercise1.model.business;

public abstract class Company implements ICompany {

	private String taxId;

	/**
	 * factory method for subclasses
	 * @param companyType type of the company
	 * @return return an object of the company type
	 */
	public static Company create(CompanyType companyType) {
		Company company = null;
		company = switch (companyType) {
			case LOCAL -> new LocalCompany();
			case FOREIGN -> new ForeignCompany();
		};
		return company;
	}

	protected long id;
	protected String name;

	public Company() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String setName() {
		return null;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxId() {
		return this.taxId;
	}
}
