class Solution {
    public int[] sortArray(int[] nums) {
        // Question asks for sorting without any built in methods
        // We are planning to use smallest space complexity -> Quicksort?
        // is the pivot (largest element in the end of the array? ) -> No
            // If yes, we need to ask if we can use Merge sort for O(nLogn)
        // Are we assuming majority of elements are already sorted? -> No
            // If yes, we need to ask if we can use Merge sort for O(nLogn)
        
        // To implement quicksort
        // We need two methods -> Partition, Quicksort
        // Partition: Helper function to sort the elements with chosen pivot and keep
            // iterating until we hit the middle of array
        // Quicksort: Recursive function that calls on Partition until the left side 
            // of the array elements (middle pivot) are smaller than right
        return quicksort(0, nums.length-1, nums);
    }

    public void swap(int l, int r, int[] nums){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public int partition(int start, int end, int[] nums){
        int p = start, pivot = nums[end];
        for (int i=start; i < end; i++){
            if (nums[i] < pivot){
                swap(p, i, nums);
                p++;
            }
        }
        swap(p, end, nums);
        return p;
    }

    public int[] quicksort(int l, int r, int[] nums){
        if (l < r){
            int p = partition(l,r,nums);
            quicksort(l, p-1, nums);
            quicksort(p+1, r, nums);
        }
        return nums;
    }
}