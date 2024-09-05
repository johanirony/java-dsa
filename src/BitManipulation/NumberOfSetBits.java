package BitManipulation;

public class NumberOfSetBits {
    public static void main(String[] args) {
        int a=7;
        System.out.println(bits(a));

    }
    static int bits(int n){
        int count =0;
        while(n>0){
            if((n&1)==1){
                count ++;



            }
            n=n>>1;
        }
        return count;
    }
}
