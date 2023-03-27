package Array;

public class RunningSumOf1dArray {

    /***
     * TODO
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */

    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] prefixSum = new int[len];
        prefixSum[0] = nums[0];

        for (int i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        return prefixSum;

    }

}

