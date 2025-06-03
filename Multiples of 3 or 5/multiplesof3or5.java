public class multiplesof3or5 {
    public static void main(String[] args) {
        int sum = 0;
        int end = 1000;
        for (int start = 1; start < end; start++) {
            if (start % 3 == 0 || start % 5 == 0) {
                sum += start;
            }
        }
        System.out.println("The sum of all multiples of 3 or 5 below " + end + " is: " + sum);
    }
}