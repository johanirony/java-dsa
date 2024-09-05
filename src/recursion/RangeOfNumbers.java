package recursion;

public class RangeOfNumbers {
    public static void main(String[] args) {
        range(5);



    }
    static void range(int n){

        if(n==0){
            return;
        }
        range(n-1);
        System.out.println(n);


    }

}
