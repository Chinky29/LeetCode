class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy elements from nums2 into the remaining slots of nums1
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        
       
        Arrays.sort(nums1);
    }
}