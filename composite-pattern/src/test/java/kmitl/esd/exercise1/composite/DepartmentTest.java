package kmitl.esd.exercise1.composite;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DepartmentTest {
	Department department;

	/**
	 * prepare department for test
	 */
	@BeforeEach
	void prepareDepartment() {
		department = new Department("TEST", 40);
	}

	/**
	 * Test that the instance is not null
	 */
	@Test
	void getInstance() {
		assertNotNull(department);
	}

	/**
	 * Test if adding business units work properly
	 */
	@Test
	void add() {
		Department department1 = new Department("TEST2", 40);
		Department department2 = new Department("TEST3", 40);

		department.add(department1);
		department.add(department2);

		List<IBusinessUnit> units = department.getDepartmentList();

		assertEquals(units.size(), 2);
	}

	/**
	 * Test if removing business units work properly
	 */
	@Test
	void remove() {
		Department department1 = new Department("TEST2", 40);
		Department department2 = new Department("TEST3", 40);

		department.add(department1);
		department.add(department2);
		department.remove(department2);

		List<IBusinessUnit> units = department.getDepartmentList();

		assertEquals(units.size(), 1);
	}
}