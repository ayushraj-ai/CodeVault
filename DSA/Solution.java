class Solution {
    public static int removeDuplicates(int[] nums) {
        int[] nums  = new int[5];
        int idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[idx]) {
                idx++;
                nums[idx] = nums[i];
            }
        }
        return idx + 1 ;
    }
    public static void main(String[] args) {
        int[] nums = {0 ,1 , 2 ,3 ,4};
        System.out.println(removeDuplicates(nums));
    }
}