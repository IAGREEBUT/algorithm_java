package Array;

public class has23 {

    public static boolean has23(int[] nums) {
        return (nums[0]==2 || nums[0] == 3 || nums[1]==2 || nums[1] == 3);
    }



    public static void main(String[] args) {
        int []arr = {1,2};
        System.out.println(has23(arr));

    }
}
