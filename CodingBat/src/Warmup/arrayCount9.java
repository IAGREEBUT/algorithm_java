package Warmup;

public class arrayCount9 {


    public static int arrayCount9(int[] nums){

        int ans=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]==9) ans++;
        }

        return ans;

    }

    public static void main(String[] args) {

        int[] nums = {9,2,3};

        System.out.println(arrayCount9(nums));

    }

}
