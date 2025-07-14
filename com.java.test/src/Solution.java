public class Solution {
public static int findTargetSumWays(int[] nums, int target) {
        int total1 = 0; int count = 0; int total2 = 0;
        for(int i=0;i<nums.length;i++){
            total1 += nums[i];
            System.out.println(total1);
            total2 -= nums[i];
            System.out.println(total2);
            }
        if(total1 == target){
            count ++;
        }else if(total2 == target){
            count++;
        }
        return count;
    }
public static void main(String [] args){
    int [] nums = {1,1,1,1,1};
    System.out.println (findTargetSumWays( nums, 3));
    }    
}