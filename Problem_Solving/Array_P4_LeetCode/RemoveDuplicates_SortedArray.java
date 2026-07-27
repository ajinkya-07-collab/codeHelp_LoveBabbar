package Problem_Solving.Array_P4_LeetCode;

public class RemoveDuplicates_SortedArray {

    // using two pointer

    static int getUniqueElements(int[] nums) {

        int i = 0; // position & count of unique element
        int j = 1; // traverse & searches for new elements

        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 2, 3, 3, 3, 4 };
        System.out.println(getUniqueElements(nums));
    }

}
