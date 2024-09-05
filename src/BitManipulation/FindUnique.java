package BitManipulation;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={1,2,2,3 ,3,4,4};
        System.out.println(unique(arr));
    }

    private static int unique(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique ^=n;

        }
        return unique;

    }
}
