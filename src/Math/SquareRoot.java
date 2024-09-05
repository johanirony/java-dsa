package Math;

public class SquareRoot {
    public static void main(String[] args) {
        int a=35;
        int p=3;
        System.out.printf("%.3f",squareroot(a,p));
    }
    static double squareroot(int a, int p){
        int s=0;
        int e=a;
        double root=0;
        while(s<=e){
            int m = s+ (e-s)/2;
            if(m*m== a){
                return m;
            }
            if(m*m>a){
                e=m-1;
            }
            else{
                s=m+1;
            }




        }
        double b=0.1;
        for(int i=0;i<p;i++){
            while (root * root<=a){
                root += b;
            }
            root -=b;
            b /=10;
        }
        return root;

    }
}
