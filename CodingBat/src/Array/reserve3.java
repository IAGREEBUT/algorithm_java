package Array;

public class reserve3 {

    public static int[] reverse3(int[] nums) {

        int[] ans = new int[3];

        int j = 0;
        for(int i=nums.length-1; i>=0; i--){
            ans[j++] = nums[i];
        }

        return ans;
    }


    public static void main(String[] args) {

        int []nums = {1,2,3};

        System.out.println(reverse3(nums));

    }

}
