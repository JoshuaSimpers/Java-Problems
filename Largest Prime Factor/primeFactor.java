public class primeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        int currentDivisor = 2;
        int largestDivisor = 0;
        for (; currentDivisor <= number; currentDivisor++) {
            if (number % currentDivisor == 0) {
                number = (number / currentDivisor);
                largestDivisor = currentDivisor;
                currentDivisor = 2;
            }
        }
        System.out.println();
        System.out.println(largestDivisor);
    }
}
