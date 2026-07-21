package Problem_Solving.Array_P1;

public class Beginner {

    // Q:Find Avg of Array?

    public static double getAverage(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    // Q:Multiply each element of Array by 10

    public static int[] multiplyBy10(int[] arr) {
        int size = arr.length;
        int[] newArr = new int[size];

        for (int i = 0; i < size; i++) {

            newArr[i] = arr[i] * 10;

        }
        return newArr;

    }

    // Q:Search for element in Array(Linear Search)

    public static boolean findKey(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;

    }

    // max element in Array

    public static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                // max = arr[i];
                max = Math.max(max, arr[i]);
            }
        }
        return max;
    }

    // sum of +ve and -ve numbers
    public static void getSum(int[] arr) {

        int negativeSum = 0;
        int postiveSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                postiveSum += arr[i];
            } else {
                negativeSum += arr[i];
            }
        }
        System.out.println("Positive Numbers Sum : " + postiveSum);
        System.out.println("Negative Numbers Sum : " + negativeSum);

    }

    // count ones and zeroes
    public static void getCount(int[] arr) {
        int zeroCount = 0;
        int onesCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                onesCount++;
            }
            if (arr[i] == 0) {
                zeroCount++;
            }
        }
        System.out.println("Count of Zeroes : " + zeroCount);
        System.out.println("Count of Ones : " + onesCount);
    }

    // first unsorted element
    public static int getFirstUnsortedElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i + 1] <= arr[i]) {
                return arr[i + 1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Average: " + getAverage(arr));

        int[] ans = multiplyBy10(arr);
        System.out.println("Printing new array : ");
        for (int i : ans) {
            System.out.println(i);
        }

        boolean keyfound = findKey(arr, 5);
        System.out.println("Linear search : " + keyfound);

        System.out.println("Maximum Element in Array : " + getMax(arr));

        int[] arr1 = { 4, 2, -4, 6, -9, -1 };
        getSum(arr1);

        int[] zeroOnes = { 1, 0, 1, 1, 1, 0, 0, 1 };
        getCount(zeroOnes);

        int unsortedElement = getFirstUnsortedElement(arr1);
        System.out.println("First Unsorted Element : " + unsortedElement);

    }

}
