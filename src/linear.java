public class linear {
    public static void main(String[] args) {
        int[] arr={2,5 ,7,-88,0,45,23,14};
        int ans = linearsearch(arr);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr){
        int ans=arr[0];

        for (int i =1;i<arr.length;i++){

            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;


    }
}
