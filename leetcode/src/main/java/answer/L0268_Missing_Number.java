package answer;

public class L0268_Missing_Number {

	public int missingNumber(int[] nums) {

		int rt = nums.length;

		for (int i = 0; i < nums.length; i++) {
			rt = rt ^ nums[i] ^ i;
		}

		return rt;
	}
}
