package recursion;

public class ReverseDigits {
    public static void main(String[] args) {
        int a=1234;
        int b=50;
        System.out.println(reverse(a));
        System.out.println(palin(a));
        System.out.println(zeros(10000));

    }
    static int reverse(int n){
        int digits =(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);

    }
    static boolean palin(int n){
        return n==reverse(n);

    }
    static int zeros(int n){
        return fun(n,0);
    }
    static int fun(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return fun(n/10,c+1);

        }
        return fun(n/10,c);
    }
}
