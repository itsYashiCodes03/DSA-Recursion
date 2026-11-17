
import java.util.*;

public class Solution {

    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, right, target);
        }
        else {
            return binarySearch(arr, left, mid - 1, target);
        }
    }

    public static void main(String[] args) {

        int target = 50;
        int[] arr = {20, 30, 40, 50, 60};

        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
    }
}
