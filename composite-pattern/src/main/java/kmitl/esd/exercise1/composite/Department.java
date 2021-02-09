package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Department extends BusinessUnit {
	private int numberOfTeams;
	private List<IBusinessUnit> departmentList = new ArrayList<IBusinessUnit>();

	public Department(String name, int numOfEmployees) {
		this.name = name;
		this.numOfEmployees = numOfEmployees;
		this.numberOfTeams = 0;
	}

	/**
	 * A function for showing the department details
	 *
	 * @return void
	 */
	@Override
	public void showDetails() {
		Logger.getLogger(Department.class.getName()).info("Department " + name + " has " + numberOfTeams + " teams");

		for (IBusinessUnit IDepartment : this.departmentList) {
			IDepartment.showDetails();
		}
	}

	/**
	 * A function for adding a department
	 *
	 * @param d department to add
	 * @return void
	 */
	public void add(IBusinessUnit d) {
		if (d == null) return;

		departmentList.add(d);

		if (d instanceof Team) {
			numberOfTeams ++;
		}
	}

	/**
	 * A function for removing a department
	 *
	 * @param d department to remove
	 * @return void
	 */
	public void remove(IBusinessUnit d) {
		departmentList.remove(d);
	}

	/**
	 * A function for getting department list
	 *
	 * @return department list
	 */
	public List<IBusinessUnit> getDepartmentList() {
		return this.departmentList;
	}
}
