class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum=cursum+nums[i];
            if(cursum>maxsum){
                maxsum=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxsum;
    }
}

/*                         Example
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        for (int i = 0; i < nums.length; i++) {
            cursum = cursum + nums[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = s.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}

if any case Interviewer ask to pritn the index modify

class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = 0;
        int start = 0,beststart=0,end=0;
        for (int i = 0; i < nums.length; i++) {
            cursum = cursum + nums[i];
            if (cursum > maxsum) {
                maxsum = cursum;
                beststart=start;
                end=i;
            }
            if (cursum < 0) {
                cursum = 0;
                start=i+1;
            }
        }
        System.out.println("maximum subarray found In betwwen the index of "+beststart+"to"+end);
        return maxsum;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = s.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum = " + result);
    }
}

 */