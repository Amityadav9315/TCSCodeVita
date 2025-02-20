package TCS;

import java.util.*;

class CountRock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt(); // Size of the array
        int t = sc.nextInt(); // Number of queries

        int[] a = new int[s];
        for (int i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }

        // Sort the array for binary search
        Arrays.sort(a);

        for (int i = 0; i < t; i++) {
            int l1 = sc.nextInt(); // Lower bound
            int l2 = sc.nextInt(); // Upper bound

            // Find the first index >= l1
            int leftIndex = lowerBound(a, l1);
            // Find the first index > l2
            int rightIndex = upperBound(a, l2);

            // The count is the difference between the two indices
            int count = rightIndex - leftIndex;
            System.out.print(count + " ");
        }
    }

    // Binary search to find the first index >= target
    private static int lowerBound(int[] a, int target) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Binary search to find the first index > target
    private static int upperBound(int[] a, int target) {
        int left = 0, right = a.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (a[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}