package Warmup;

public class arrayFront9 {

    public static boolean arrayFront9(int[] nums){

        int len = 4;
        if(nums.length<len) len = nums.length;

        for(int i=0;i<len;i++){
            if(nums[i]==9) return true;
        }
        return false;
    }

    public static void main(){

        int[] arr = {1,2,9,3,4};

        System.out.println(arrayFront9(arr));


    }
}
