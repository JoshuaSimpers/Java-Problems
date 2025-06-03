public class Main {
    public static void main(String[] args) {
        int largestPalindrome = 0;
        int currentProduct = 0;
        String productAsString;
        for (int i = 1; i <= 999; i++) {
            for (int x = 1; x <= 999; x++) {
                currentProduct = i * x;
                productAsString = String.valueOf(currentProduct);
                String reversedProduct = "";
                for (int z = productAsString.length() - 1; z >= 0; z--) {
                    reversedProduct = reversedProduct + productAsString.charAt(z);
                }
                if (productAsString.equals(reversedProduct) && currentProduct > largestPalindrome) {
                    largestPalindrome = currentProduct;
                }
            }
        }
        System.out.println("The largest palindrome from the product of two 3-digit numbers is " + largestPalindrome);
    }
}
