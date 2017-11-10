package leetcodequestions;

import java.util.Arrays;
import java.util.Comparator;

public class Largestnumber {
	public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) return "";
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = nums[i]+"";
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String i, String j) {
                String s1 = i+j;
                String s2 = j+i;
                return s1.compareTo(s2);
            }
        });
        if (strs[strs.length-1].charAt(0) == '0') return "0";
        String res = new String();
        for (int i = 0; i < strs.length; i++) {
            res = strs[i]+res;
        }
        System.out.println(res);
        return res;
    }
	public static void main(String[] args) {
		int[] nums= {3,30,34,5,9,72};
		largestNumber(nums);
		
	}
}
