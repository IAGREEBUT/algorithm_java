package Warmup;

public class makeLast {

    public static int[] makeLast(int[] nums) {
        int len = nums.length;

        int[] ans = new int[len*2];//길이가 nums.length*2
        ans[len*2-1] = nums[len-1];

        return ans;
    }


    public static void main(String[] args) {
        int []arr = {0,1,2,4};
        System.out.println(makeLast(arr));
    }

}
