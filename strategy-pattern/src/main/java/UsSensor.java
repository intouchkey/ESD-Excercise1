import kmitl.esd.exercise1.model.business.Average;

public class UsSensor {

	private Average averageAlgorithm;
	private double[] values;

	/**
	 * A function to set average algorithm
	 *
	 * @param averageAlgorithm
	 * @return void
	 */
	public void setAverage(Average averageAlgorithm) {
		this.averageAlgorithm = averageAlgorithm;
	}

	/**
	 * A function to set values
	 *
	 * @param values
	 * @return void
	 */
	public void setValues(double[] values) {
		this.values = values;
	}

	/**
	 * A function to find average
	 *
	 * @return average
	 */
	public double getAverage() {
		double avg = averageAlgorithm.solve(values);

		return avg;
	}
}
