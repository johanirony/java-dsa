package BitManipulation;

public class Setbit {
    public static void main(String[] args) {
        int a=7;
        System.out.println(reset(a,2));

    }
    static int setbit(int a , int n){
        a |= (1<<(n-1));
        return a;
    }
    static int reset (int a ,int n){
        a ^= (1<<(n-1));
        return a;
    }

}
