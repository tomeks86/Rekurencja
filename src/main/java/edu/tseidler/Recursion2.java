package edu.tseidler;

public class Recursion2 {

    public boolean groupSum(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        return groupSum(start + 1, nums, target - nums[start]) ||
                groupSum(start + 1, nums, target);
    }

    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        return nums[start] == 6 ?
                groupSum6(start + 1, nums, target - nums[start]) :
                groupSum6(start + 1, nums, target - nums[start]) ||
                        groupSum6(start + 1, nums, target);
    }

    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        return groupNoAdj(start + 1, nums, target) ||
                groupNoAdj(start + 2, nums, target - nums[start]);
    }

    public boolean groupSum5(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        if (nums[start] % 5 == 0) {
            if (start + 1 < nums.length && nums[start + 1] == 1)
                return groupSum5(start + 2, nums, target - nums[start]);
            else
                return groupSum5(start + 1, nums, target - nums[start]);
        } else
            return groupSum5(start + 1, nums, target) ||
                    groupSum5(start + 1, nums, target - nums[start]);
    }
}
