package Array;

public class maxEnd3 {

    public static int[] maxEnd3(int[] nums) {

        if(nums[0]>nums[2]){
            return new int[]{nums[0],nums[0],nums[0]};
        }

        return new int[]{nums[2],nums[2],nums[2]};

    }


    public static void main(String[] args) {

        int[] arrays = {1,2,3};
        System.out.println(maxEnd3(arrays));

    }
}
