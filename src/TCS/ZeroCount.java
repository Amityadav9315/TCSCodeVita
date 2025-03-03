package TCS;

import java.util.Scanner;

public class ZeroCount {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();

        if (k == 0) {
            System.out.println(l);
        } else if (k == l) {
            System.out.println(0);
        } else {
            int num_gaps = k + 1;
            int base_zeros = (l - k) / num_gaps;
            int extra_zeros = (l - k) % num_gaps;
            if (extra_zeros > 0) {
                System.out.println(base_zeros + 1);
            } else {
                System.out.println(base_zeros);
            }
        }
    }
}


