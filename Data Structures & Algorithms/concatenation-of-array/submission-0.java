class Solution {
    public int[] getConcatenation(int[] nums) {
        // So we are creating a new array of double the size
        int n = nums.length;
        int[] newArr = new int[2*n];
        // Populate the new array with ans[i] = nums[i]
        for (int i=0; i<n; i++){
            newArr[i] = nums[i];
            newArr[i+n] = nums[i];
        }
        return newArr;
    }
}