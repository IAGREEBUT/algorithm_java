package Array;

public class sum3 {

    public static int sum3(int[] nums) {

        return nums[0] + nums[1] + nums[2];

    }

    public static int sum3_2(int[] nums) {

        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }

        return sum;

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        System.out.println(sum3(nums));

    }
}
