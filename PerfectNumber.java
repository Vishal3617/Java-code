public class PerfectNumber {
    public static void main(String[] args) {
        int numberToCheck = 28; // Change this number to the one you want to check
        
        if (isPerfectNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is a perfect number.");
        } else {
            System.out.println(numberToCheck + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int num) {
        int sum = 1; // Start with 1 as all numbers are divisible by 1
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
