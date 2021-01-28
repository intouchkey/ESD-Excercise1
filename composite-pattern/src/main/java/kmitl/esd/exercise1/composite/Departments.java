package kmitl.esd.exercise1.composite;

import java.util.ArrayList;
import java.util.List;

public class Departments implements IDepartment {
	private List<IDepartment> departmentList = new ArrayList<IDepartment>();

	@Override
	public void showDepartmentDetails() {
		for (IDepartment IDepartment : this.departmentList) {
			IDepartment.showDepartmentDetails();
		}
	}

	public void addDepartment(IDepartment d) {
		departmentList.add(d);
	}

	public void removeDepartment(IDepartment d) {
		departmentList.remove(d);
	}
}
