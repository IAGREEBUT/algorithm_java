package Array;

public class sum2 {

    public static int sum2(int[] nums) {

        int len = nums.length;

        if(len==0) return 0;
        else if(len==1) return nums[0];
        return nums[0]+nums[1];

    }


    public static void main(String[] args) {
        int []nums = {1,2,3};
        System.out.println(sum2(nums));
    }


}
