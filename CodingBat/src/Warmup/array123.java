package Warmup;

public class array123 {

    public static boolean array123(int[] nums){

        int len = nums.length;

        for(int i=0;i<=len-3;i++){

            if(nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;

        }

        return false;

    }

    public static void main(){

        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1, 1, 2, 4, 1};
        int[] nums3 = {1, 1, 2, 1, 2, 3};

        System.out.println(array123(nums1));
        System.out.println(array123(nums2));
        System.out.println(array123(nums3));


    }
}
