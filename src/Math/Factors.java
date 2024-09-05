package Math;

public class Factors {
    public static void main(String[] args) {
        int a=36;
        factors(a);

    }
    static void factors(int a){
        for (int i =1 ; i<=Math.sqrt(a);i++){

            if(a%i==0){
                if(a/i==i){
                    System.out.println(i);
                }
                else {
                System.out.println(i +" " + a/i);}
            }
        }
    }
}
