class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();
        for (int n: nums){
            if (!visited.add(n)){
                return true;
            }
        }
        return false;
    }
}