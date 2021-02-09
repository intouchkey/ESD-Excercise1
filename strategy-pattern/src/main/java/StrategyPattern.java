import java.util.logging.Logger;

import kmitl.esd.exercise1.model.business.AverageMean;
import kmitl.esd.exercise1.model.business.AverageMedian;

public class StrategyPattern {

	/**
	 * A main function for showing that the implementation works
	 *
	 * @return void
	 */
	public static void main(String[] args) {
		double[] values = {1.5, 2.5, 3.5, 5.0};
		UsSensor usSensor = new UsSensor();

		usSensor.setValues(values);

		AverageMean averageMean = new AverageMean();
		AverageMedian averageMedian = new AverageMedian();

		usSensor.setAverage(averageMean);
		double avg1 = usSensor.getAverage();
		Logger.getLogger(UsSensor.class.getName()).info(Double.toString(avg1));

		usSensor.setAverage(averageMedian);
		double avg2 = usSensor.getAverage();
		Logger.getLogger(UsSensor.class.getName()).info(Double.toString(avg2));
	}
}
