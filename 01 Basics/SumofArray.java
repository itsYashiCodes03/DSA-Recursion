import java.util.*;
public class Solution {

    public static int sumOfArray(int[] arr, int n, int index) {
        if (index == n) {
            return 0; //Base case
        }

        return arr[index] + sumOfArray(arr, n, index + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int sum = sumOfArray(arr, arr.length, 0);

        System.out.println(sum);
    }
}
