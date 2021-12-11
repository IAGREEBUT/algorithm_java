package Array;

public class firstLast6 {


    public static boolean firstLast6(int[] nums) {
        int len = nums.length;
        return (nums[0]==6 || nums[len-1]==6);
    }


    public static void main(String[] args) {

        int[] nums = {6,1,2,3,4};

        System.out.println(firstLast6(nums));
    }
}
