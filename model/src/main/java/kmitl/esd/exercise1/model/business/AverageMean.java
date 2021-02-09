package kmitl.esd.exercise1.model.business;

import java.util.List;

public class AverageMean implements Average {

	@Override
	public double solve(double[] nums) {
		double sum = 0.0;

		for (Double num: nums) {
			sum += num;
		}

		return sum / nums.length;
	}
}
