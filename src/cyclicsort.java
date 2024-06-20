import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int[]arr={5,4,2,1,3};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cycle(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void swap(int[]arr,int i,int correct){
        int temp=arr[i];
        arr[i]=arr[correct];
        arr[correct]=temp;
    }

}
