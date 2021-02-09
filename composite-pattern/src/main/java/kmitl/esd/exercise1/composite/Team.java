package kmitl.esd.exercise1.composite;

import java.util.logging.Logger;

public class Team extends BusinessUnit {
	public Team(String name, int numOfEmployees) {
		this.name = name;
		this.numOfEmployees = numOfEmployees;
	}

	/**
	 * A function for showing the team details
	 *
	 * @return void
	 */
	@Override
	public void showDetails() {
		Logger.getLogger(Team.class.getName()).info(" -> Team " + name + " has " + numOfEmployees + " employees");
	}
}
