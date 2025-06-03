public class Main {
    public static void main(String[] args) {
        int numberOfTerms = 100;
        double startTime = System.currentTimeMillis();
        double totalTime = 0;
        System.out.println();
        System.out.println((squareOfSum(numberOfTerms) - sumOfSquares(numberOfTerms)));
        double endTime = System.currentTimeMillis();
        totalTime = (endTime - startTime) / 1000;
        System.out.println("Time: " + totalTime + " seconds.");
    }
    public static int sumOfSquares(int nthTerm) {
        int sumOfSquares = 0;
        for (int i = 1; i <= nthTerm; i++) {
            sumOfSquares += Math.pow(i, 2);
        }
        return sumOfSquares;
    }
    public static int squareOfSum(int nthTerm) {
        int squareOfSum = 0;
        int sum = 0;
        for (int i = 1; i <= nthTerm; i++) {
            sum += i;
        }
        squareOfSum = (int) Math.pow(sum, 2);
        return squareOfSum;
    }
}
