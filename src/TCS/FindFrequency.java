package TCS;

import java.util.Scanner;

public class  FindFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter the numbers:");


        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        int[] count = new int[max + 1];

        for (int num : numbers) {
            count[num]++;
        }

        System.out.println("Number Frequencies:");
        for (int i = 0; i <= max; i++) {
            if (count[i] > 0) {
                System.out.println(i + " -> " + count[i]);
            }
        }

        scanner.close();
    }
}
