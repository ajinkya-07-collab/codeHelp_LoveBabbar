package Problem_Solving.Array_P4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

    static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> op = new HashSet<>();// no duplicatetriplets so used SET
        int target = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    if (nums[i] + nums[j] + nums[k] == target) {

                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);

                        Collections.sort(temp);

                        if (!op.contains(temp)) {
                            op.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(op);
    }

    public static void main(String[] args) {

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = threeSum(nums);

        if (result.isEmpty()) {
            System.out.println("No triplets found");
        } else {
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }
    }
}