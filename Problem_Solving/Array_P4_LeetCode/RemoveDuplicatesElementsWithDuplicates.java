package Problem_Solving.Array_P4_LeetCode;

import java.util.HashSet;
import java.util.Set;

public class RemoveMissingElementsWithDuplicates {

    static int[] getUniqueElelments(int[] arr) {

        // With Extra Space Not reccomendd
        Set<Integer> set = new HashSet<>();

        // Add unique elements
        for (int num : arr) {
            set.add(num);
        }

        // convert hashset to array
        int[] unique = new int[set.size()];
        int index = 0;

        for (int num : set) {
            unique[index++] = num;
        }
        return unique;
    }

    public static void main(String[] args) {

        int[] arr = { 3, 2, 3, 4, 5 };

        int[] unique = getUniqueElelments(arr);
        for (int num : unique) {
            System.out.print(num + " ");
        }
        System.out.println("\nCount : " + unique.length);
    }

}
