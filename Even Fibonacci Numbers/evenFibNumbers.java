public class evenFibNumbers {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 0;
        int sum = 0;
        do {
            z = x + y;
            x = y;
            y = z; 
            if (y % 2 == 0) {
                sum += y;
            }
        } while (y <= 4000000);
        System.out.println(sum);
    }
}
