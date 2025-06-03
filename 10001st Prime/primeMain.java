import java.util.ArrayList;

// Task: Find the 10001st prime number
public class primeMain {
    static int maxSize = 1000005;
    public static void main(String[] args) {
        int nthTerm = 10001;
        ArrayList<Integer> primes = new ArrayList<>();
        double startTime = System.currentTimeMillis();
        double totalTime = 0;
        sieveOfEratosthenes(primes);
        double endTime = System.currentTimeMillis();
        totalTime = (endTime - startTime) / 1000;
        System.out.println("The prime of nth term " + nthTerm + " is " + primes.get(nthTerm - 1) + ". Time: " + totalTime + " seconds.");
    }

    public static void sieveOfEratosthenes(ArrayList<Integer> primes) {
        boolean isPrime[] = new boolean[maxSize];
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int p = 2; p * p < maxSize; p++) {
            if (isPrime[p] == true) {
                for (int i = p * p; i < maxSize; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        for (int p = 2; p < maxSize; p++) {
            if (isPrime[p] == true) {
                primes.add(p);
            }
        }
    }
}
