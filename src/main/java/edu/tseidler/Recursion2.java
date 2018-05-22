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

    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length)
            return target == 0;
        int mult = findSimilar(start, nums);
        return groupSumClump(start + mult, nums, target) ||
                groupSumClump(start + mult, nums, target - mult * nums[start]);
    }

    private int findSimilar(int start, int[] nums) {
        if (start == nums.length - 1)
            return 1;
        int first = nums[start];
        int mult = 1;
        while (nums[++start] == first)
            mult++;
        return mult;
    }

    public boolean splitArray(int[] nums) {
        return splitArray(0, nums, 0, 0);
    }

    private boolean splitArray(int start, int[] nums, int sumLeft, int sumRight) {
        if (start >= nums.length)
            return sumLeft == sumRight;
        return splitArray(start + 1, nums, sumLeft + nums[start], sumRight) ||
                splitArray(start + 1, nums, sumLeft, sumRight + nums[start]);
    }

    public boolean splitOdd10(int[] nums) {
        return splitOdd10(0, nums, 0, 0);
    }

    private boolean splitOdd10(int start, int[] nums, int sumLeft, int sumRight) {
        if (start >= nums.length)
            return (sumLeft % 10 == 0 && sumRight % 2 == 1) ||
                    (sumRight % 10 == 0 && sumLeft % 2 == 1);
        return splitOdd10(start + 1, nums, sumLeft + nums[start], sumRight) ||
                splitOdd10(start + 1, nums, sumLeft, sumRight + nums[start]);
    }

    public boolean split53(int[] nums) {
        return split53(0, nums, 0, 0);
    }

    private boolean split53(int start, int[] nums, int sum3, int sum5) {
        if (start >= nums.length)
            return sum3 == sum5;
        if (nums[start] % 5 == 0)
            return split53(start + 1, nums, sum3, sum5 + nums[start]);
        else if (nums[start] % 3 == 0)
            return split53(start + 1, nums, sum3 + nums[start], sum5);
        else
            return split53(start + 1, nums, sum3 + nums[start], sum5) ||
                    split53(start + 1, nums, sum3, sum5 + nums[start]);
    }
}
