package recursion;

import java.util.ArrayList;

public class    BS {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};

//        System.out.println(search1(arr,66,0));
        System.out.println(rotatedBS(arr,6,0,arr.length-1));

    }
    static int search(int[] arr,int target ,int s ,int e){
        if(s>e){
            return -1;

        }
        int m = s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(target<arr[m]){
            return search(arr,target,s,m-1);
        }
        return search(arr,target,m+1,e);
    }
    static int search1(int[] arr ,int target ,int n){

        if(arr[n]==target){
            return n;
        }
        return search1(arr,target,n+1);
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target , int index , ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target , int index ){
        ArrayList<Integer>list= new ArrayList<>();

        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow=findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;

    }
    static int rotatedBS(int[] arr, int target ,int s ,int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;

        if(arr[m]==target){
            return m;
        }
        if (arr[s] <= arr[m]){
            if (target >= arr[s] && target <=arr[m]){
                return rotatedBS(arr,target,s,m-1);
            }
            else {
                return rotatedBS(arr,target,m+1,e);
            }
        }
        if (target >=m && target <=arr[e]){
            return rotatedBS(arr,target,s,m-1);
        }
        return rotatedBS(arr,target,s,m-1);
    }
}
