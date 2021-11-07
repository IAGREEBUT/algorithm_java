package Warmup;

public class noTriples {

    public static boolean noTriples(int[] nums) {

        int len = nums.length;

        for(int i=0; i<=len-3; i++){

            if(nums[i]==nums[i+1]&& nums[i+1]==nums[i+2]) return false;

        }
        return true;


    }



    public static void main(String[] args) {

        int[] nums1 = {1, 1, 2, 2, 1};
        int[] nums2 = {1, 1, 2, 2, 2, 1};
        int[] nums3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(nums1));
        System.out.println(noTriples(nums2));
        System.out.println(noTriples(nums3));

    }
}
