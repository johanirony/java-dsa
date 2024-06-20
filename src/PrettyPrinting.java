public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 12.0932834f;
        System.out.printf("Number = %.2f \n",a);// printing till only 2 decimal
        System.out.printf("PI = %.3f \n", Math.PI);
        System.out.printf("My name is %s %s\n","Rameez","Shaikh");// it will print in the order they are written
        System.out.printf("My name is %s %s","Shaikh","Rameez");

    }
}
