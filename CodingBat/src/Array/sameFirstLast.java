package Array;

public class sameFirstLast {


    public static boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        return (len>0 && nums[len-1] == nums[0]);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};

        System.out.println(sameFirstLast(nums));
    }

}
