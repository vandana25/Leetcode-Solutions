package leetcodequestions;

public class PivotIndex {

	public static int findPivotIndex(int[] num) {
		int sumRight = 0;
		int sumLeft = 0;
		for (int i = 1; i < num.length; i++) {
			sumRight += num[i];
		}

		for (int i = 0; i < num.length-1; i++) {
			sumLeft += num[i];
			sumRight = sumRight - num[i + 1];
			if (sumLeft == sumRight) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		findPivotIndex(nums);
	}

}
