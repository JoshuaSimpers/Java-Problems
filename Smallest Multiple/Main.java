public class Main {
    public static void main(String[] args) {
        int smallestNumber = 300000000;
        double startTime = System.currentTimeMillis();
        double totalTime;
        for (int i = smallestNumber; i > 0; i = i - 20) {
            if (totalPasses(i) >= 19) {
                smallestNumber = i;
            }
        }
        double endTime = System.currentTimeMillis();
        totalTime = endTime - startTime;
        System.out.println("Smallest number: " + smallestNumber + ", Tests Passed (Out of 19): " + totalPasses(smallestNumber) + ", Time: " + totalTime / 1000 + " seconds.");
    }

    public static int totalPasses(int currentNumber) {
        int numberOfPasses = 0;
        for (int i = 2; i <= 20; i++) {
            if (currentNumber % i == 0) {
                numberOfPasses++;
            } else {
                return numberOfPasses;
            }
        }
        return numberOfPasses;
    }
}
