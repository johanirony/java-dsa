package BitManipulation;

public class IBit {
    public static void main(String[] args) {
        int a=3;
        System.out.println(bit(1,a));

    }
    static int bit(int n,int a){
        return ((a & (1 << (n - 1))) >> (n - 1));
    }
}
