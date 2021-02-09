package kmitl.esd.exercise1.model.business;

import java.util.Arrays;

public class AverageMedian implements Average {

	@Override
	public double solve(double[] nums) {
		Arrays.sort(nums);

		if (nums.length % 2 != 0)
			return nums[nums.length / 2];

		return (nums[(nums.length - 1) / 2] + nums[nums.length / 2]) / 2.0;
	}
}
