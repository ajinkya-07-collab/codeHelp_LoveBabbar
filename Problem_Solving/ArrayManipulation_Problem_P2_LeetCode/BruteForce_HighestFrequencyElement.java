package Problem_Solving.ArrayManipulation_Problem_P2_LeetCode;

public class BruteForce_HighestFrequencyElement {

    static void getMode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;
        int minCount = 0;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
            if (count < minCount) {
                minCount = count;
                min = arr[i];
            }
        }
        System.out.println("Highest Frequency Element : " + mode);
        System.out.println("Least Frequency Element : " + min);

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        getMode(arr);
    }

}
