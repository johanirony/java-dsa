package BitManipulation;

public class Power {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        System.out.println(power(a,b));
    }
    public static long power(long a, long b) {
        long result = 1;
        long base = a;

        while (b > 0) {
            if ((b & 1) == 1) { // Check if b is odd using bitwise AND
                result *= base;
            }
            base *= base; // Square the base
            b >>= 1; // Right shift b by 1 (equivalent to b /= 2)
        }

        return result;
    }
}
