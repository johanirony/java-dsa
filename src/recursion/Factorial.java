package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(sumofdigits(505));
        fun(5);
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    static int sumofdigits(int n){
        if (n%10==n){
            return n;
        }
        return n%10*sumofdigits(n/10);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        fun(--n);
        System.out.println(n);
        }


}
