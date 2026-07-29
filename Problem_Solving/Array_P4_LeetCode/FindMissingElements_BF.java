package Problem_Solving.Array_P4_LeetCode;

import java.util.HashSet;

public class FindMissingElements_BF {

    // O(n*n) -> complexity

    static int[] getMissingElements(int[] arr) {
        int n = arr.length;
        int[] missing = new int[n];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            Boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i == arr[j]) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                missing[index++] = i;
            }
        }
        return missing;
    }

    static int[] getMissingElementsOptimised(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int count = 0;

        // count missing element

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                count++;
            }
        }

        int[] missing = new int[count];
        int index = 0;

        for (int i = 1; i <= arr.length; i++) {
            if (!set.contains(i)) {
                missing[index++] = i;
            }
        }
        return missing;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 4, 4, 5, 2, 2 };
        int[] result = getMissingElements(arr);
        for (int num : result) {
            if (num != 0)
                System.out.print(num + " ");
        }
    }

}
