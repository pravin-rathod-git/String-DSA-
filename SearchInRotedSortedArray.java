public class SearchInRotedSortedArray {

    public static int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target)
                return mid;

            // Left half is sorted
            if (nums[mid] >= nums[l]) {
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        

        // Example 1
        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;
        System.out.println("Index of " + target1 + ": " + search(nums1, target1));

        // Example 2
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int target2 = 3;
        System.out.println("Index of " + target2 + ": " + search(nums2, target2));

        // Example 3
        int[] nums3 = {1};
        int target3 = 0;
        System.out.println("Index of " + target3 + ": " + search(nums3, target3));

        // Example 4
        int[] nums4 = {6, 7, 8, 1, 2, 3, 4, 5};
        int target4 = 3;
        System.out.println("Index of " + target4 + ": " + search(nums4, target4));
    }


}
