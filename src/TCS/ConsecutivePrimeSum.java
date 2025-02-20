package TCS;

import java.util.*;

class ConsecutivePrimeSum {


    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }
    static int countConsecutivePrimeSums(int n) {
        boolean[] isPrime = sieveOfEratosthenes(n);

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        int count = 0;
        int sum = 2;


        for (int i = 1; i < primes.size(); i++) {
            sum += primes.get(i);
            if (sum > n) {
                break;
            }
            if (isPrime[sum]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countConsecutivePrimeSums(n);
        System.out.println(result);
    }
}