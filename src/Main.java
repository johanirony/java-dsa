import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,5,66,7,65};
        System.out.println(max(arr));





    }
    static int max(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){

            sum=sum+arr[i];
        }
        return sum;


    }

}