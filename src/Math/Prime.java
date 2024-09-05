package Math;

public class Prime {
    public static void main(String[] args) {
        int a=13;
        System.out.println(prime(a));

    }
    static boolean prime (int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
