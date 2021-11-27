package Warmup;

public class array667 {


    public static int array667(int[] nums) {

        int len = nums.length;
        int cnt = 0;
        for(int i=0;i<len-1;i++){
            if(nums[i]==6 && nums[i+1]==6) cnt++;
            else if(nums[i]==6 && nums[i+1]==7) cnt++;
        }
        return cnt;
    }

    public static int array6672(int[] nums) {

        int len = nums.length;
        int cnt = 0;
        for(int i=0;i<len-1;i++){
            if(nums[i]==6){
                if(nums[i+1] == 6 || nums[i+1]==7)cnt++;
            }
        }
        return cnt;
    }


    public static void main(String[] args) {

        int[] nums = {6,6,2};

        System.out.println(array667(nums));

    }
}
