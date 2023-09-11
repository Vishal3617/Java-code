public class IncrementDecrementExample {
    public static void main(String[] args) {
        int x = 5;
        
        int preIncrementResult = ++x;
        System.out.println("Pre-increment: x = " + x + ", preIncrementResult = " + preIncrementResult);
        
        x = 5;
        
        int postIncrementResult = x++;
        System.out.println("Post-increment: x = " + x + ", postIncrementResult = " + postIncrementResult);
        
        x = 5;
        
        int preDecrementResult = --x;
        System.out.println("Pre-decrement: x = " + x + ", preDecrementResult = " + preDecrementResult);
        
        x = 5;
        
        int postDecrementResult = x--;
        System.out.println("Post-decrement: x = " + x + ", postDecrementResult = " + postDecrementResult);
    }
}
