class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        boolean inc=true;
        boolean dec=true;
        for(int i=0;i<=n-2;i++){
            if(nums[i]>nums[i+1]){
                 inc=false;
            }
        }
        for(int i=0;i<=n-2;i++){
            if(nums[i]<nums[i+1]){
                dec=false;
            }
        }
        if(inc==true || dec==true){
            return true;
        }else{
            return false;
        }
    }
}