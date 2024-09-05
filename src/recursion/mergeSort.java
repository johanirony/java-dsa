package recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr= {9,7,4,2,1,3};
        int[] ans=recursiveBubbleSort(arr,arr.length);


        System.out.println(Arrays.toString(ans));

    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left= mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge (int[] first , int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k = 0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]= first[i];
                i++;

            }else{
                mix[k]=second[j];
                j++;

            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
    static int[] recursiveBubbleSort(int[] arr,int n){
        if(n==1){
            return arr;
        }
        for(int i =0; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }


        }
        return recursiveBubbleSort(arr,n-1);
    }
}
