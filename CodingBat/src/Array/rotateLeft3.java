package Array;

public class rotateLeft3 {


    public static int[] rotateLeft3(int[] nums) {

        int[] ans = new int[3];

        for(int i=0; i<nums.length; i++){
            ans[i] = nums[(i+1)%3];
        }

        return ans;

    }



    public static void main(String[] args) {

        int []nums = {1,2,3};

        System.out.println(rotateLeft3(nums));
    }

}
