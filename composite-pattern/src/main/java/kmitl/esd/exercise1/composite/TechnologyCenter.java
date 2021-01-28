package kmitl.esd.exercise1.composite;

public class TechnologyCenter extends Department {
	public TechnologyCenter(String name, int numOfEmployees) {
		this.name = name;
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public void showDepartmentDetails() {
		System.out.println("Technology Center Department " + name + ": " + numOfEmployees + " employees.");
	}
}
