package BitManipulation;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5};
        int target = 1;
        System.out.println(removeElement(arr, target));
    }
    static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int item : nums) {
            // n^n = 0
            if ((item ^ val) != 0) {
                nums[count++] = item;
            }
        }
        return count;
    }
}
