package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class MinGift {


        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();

            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int[] gifts = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                Arrays.fill(gifts, 1);
                for (int i = 1; i < n; i++) {
                    if (arr[i] > arr[i - 1]) {
                        gifts[i] = gifts[i - 1] + 1;
                    }
                }

                // Traverse right to left
                for (int i = n - 2; i >= 0; i--) {
                    if (arr[i] > arr[i + 1]) {
                        gifts[i] = Math.max(gifts[i], gifts[i + 1] + 1);
                    }
                }

                int sum = 0;
                for (int gift : gifts) {
                    sum += gift;
                }

                System.out.println(sum);
            }
        }
    }

    


}
