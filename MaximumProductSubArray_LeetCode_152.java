class Solution {
    public int maxProduct(int[] nums) {
        int large_product = Integer.MIN_VALUE;
        int cursum=1;
        for(int i=0;i<nums.length;i++){
            cursum=cursum*nums[i];
            if(cursum>large_product){
                large_product=cursum;
            }
            if(cursum<0){
                cursum=1;
            }
        }
        return large_product;
    }
}

/*                    Example

class Solution {

    public int maxProduct(int[] nums) {
        int large_product = Integer.MIN_VALUE;
        int cursum = 1;

        for (int i = 0; i < nums.length; i++) {
            cursum = cursum * nums[i];

            if (cursum > large_product) {
                large_product = cursum;
            }

            // reset when product becomes 0 or negative
            if (cursum <= 0) {
                cursum = 1;
            }
        }

        return large_product;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {2, 3, -2, 4};
        int ans = obj.maxProduct(nums);

        System.out.println("Maximum Product = " + ans);
    }
}


 */