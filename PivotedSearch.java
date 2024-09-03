public class PivotedSearch {
    public static int getTarget(int nums[], int target) {
        int min = getMin(nums);
        if (nums[min] < target) {
            return search(nums, 0, min - 1, target);
        } else if (nums[min] > target) {
            return search(nums, min + 1, nums.length - 1, target);
        } else {
            return min;
        }
    }

    public static int search(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int getMin(int nums[]) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid - 1] > nums[mid]) {
                return mid;
            } else if (nums[start] <= nums[mid] && nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;
        System.out.println(getTarget(nums, target));
    }
}
