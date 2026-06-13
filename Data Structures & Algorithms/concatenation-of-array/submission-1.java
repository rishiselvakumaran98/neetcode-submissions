class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        // form a new array of size times 2
        int[] newArray = new int[2*n];
        for (int i=0; i<n; i++){
            newArray[i] = nums[i];
            newArray[i+n] = nums[i];
        }
        return newArray;
    }
}