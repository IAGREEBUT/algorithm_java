package Array;

public class makeEnds {

    public static int[] makeEnds(int[] nums) {
        return new int[] {nums[0], nums[nums.length-1]};
    }


    public static void main(String[] args) {
        int []nums = {1,2,3,5};
        System.out.println(nums);
    }
}
