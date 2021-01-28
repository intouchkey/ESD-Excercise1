package kmitl.esd.exercise1.composite;

public abstract class Department implements IDepartment {
	protected String name;
	protected int numOfEmployees;

	public void showDepartmentDetails() {
		System.out.println("Department " + name + ": " + numOfEmployees + " employees.");
	}
}
