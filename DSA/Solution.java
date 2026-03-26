class Solution {
    public static int removeDuplicates(int[] nums) {
        int[] nums1  = new int[5];
        int idx = 0;
        for (int i = 1; i < nums1.length; i++) {
            if(nums1[i] != nums1[idx]) {
                idx++;
                nums1[idx] = nums1[i];
            }
        }
        return idx + 1 ;
    }
    public static void main(String[] args) {
        int[] nums = {0 ,1 , 2 ,3 ,4};
        System.out.println(removeDuplicates(nums));
    }
}