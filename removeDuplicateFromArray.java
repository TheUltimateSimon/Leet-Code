class Solution {
    public int removeDuplicates(int[] nums) {
        // The unique number + position of the array
        int k = 1;

        // From 2nd number to num length, check current positon and previous
        // position num, if not equal. Set current position to the unique position to new one.
        for(int x = 1; x < nums.length; x++) {
            if(nums[x] != nums[x-1]) {
                nums[k] = nums[x];
                k++;
            }
        } 
        return k;
    }
}
