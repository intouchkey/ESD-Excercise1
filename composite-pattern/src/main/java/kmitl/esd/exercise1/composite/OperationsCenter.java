package kmitl.esd.exercise1.composite;

public class OperationsCenter extends Department {
	public OperationsCenter(String name, int numOfEmployees) {
		this.name = name;
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public void showDepartmentDetails() {
		System.out.println("Operations Center Department " + name + ": " + numOfEmployees + " employees.");
	}
}
