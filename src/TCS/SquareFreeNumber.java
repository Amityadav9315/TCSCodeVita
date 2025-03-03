import java.util.*;

class Codechef {
    // Function to check if a number is square-free
    static boolean isSquareFree(int num) {
        // Check for squares of primes <= 19 (since no prime larger than 19 divides N)
        int[] squares = {4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196};
        for (int square : squares) {
            if (num % square == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find all divisors of N
    static List<Integer> findDivisors(int N) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                divisors.add(i);    // i is a divisor
                if (i != N / i) {   // Avoid adding the square root twice
                    divisors.add(N / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String[] args) {
        // Reading input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // Finding all divisors of N
        List<Integer> divisors = findDivisors(N);

        // Count square-free divisors (excluding 1)
        int count = 0;
        for (int divisor : divisors) {
            if (divisor != 1 && isSquareFree(divisor)) {
                count++;
            }
        }

        // Output the result
        System.out.println(count);
    }
}
