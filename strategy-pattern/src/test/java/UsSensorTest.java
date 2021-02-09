import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import kmitl.esd.exercise1.model.business.AverageMean;
import kmitl.esd.exercise1.model.business.AverageMedian;

class UsSensorTest {
	private UsSensor usSensor;

	/**
	 * Prepare us sensor for testing
	 */
	@BeforeEach
	void prepareUsSensor() {
		double[] values = {1.5, 2.5, 3.5, 5.0};

		usSensor = new UsSensor();

		usSensor.setValues(values);
	}

	/**
	 * Test if getting average using mean algorithm is correct
	 */
	@Test
	void meanAverage() {
		AverageMean averageMean = new AverageMean();
		usSensor.setAverage(averageMean);
		double avg = usSensor.getAverage();

		assertEquals(avg, 3.125);
	}

	/**
	 * Test if getting average using median algorithm is correct
	 */
	@Test
	void medianAverage() {
		AverageMedian averageMedian = new AverageMedian();
		usSensor.setAverage(averageMedian);
		double avg = usSensor.getAverage();

		assertEquals(avg, 3.0);
	}
}