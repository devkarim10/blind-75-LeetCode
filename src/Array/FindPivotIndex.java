package Array;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {
        int totalSum = 0 , leftSum = 0;

        for(int i =0 ;i<nums.length; i++){
            totalSum +=nums[i];
        }

        for(int i =0; i<nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];
            if (rightSum==leftSum)  return i;
            leftSum+=nums[i];

        }
        return -1;
    }

}
