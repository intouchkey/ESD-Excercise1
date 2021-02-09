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

	/**
	 * method for getting id
	 *
	 * @return id
	 */
	public long getId() {
		return id;
	}

	/**
	 * method for setting id
	 *
	 * @param id company id
	 * @return void
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * method for getting name
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * method for setting name
	 *
	 * @param name company name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * method for getting tax id
	 *
	 * @return tax id
	 */
	public String getTaxId() {
		return this.taxId;
	}
}
