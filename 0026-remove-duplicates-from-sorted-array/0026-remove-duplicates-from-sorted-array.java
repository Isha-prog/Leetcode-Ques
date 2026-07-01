class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==0)  return 0;
        int temp[]=new int[n];
        temp[0]=nums[0];
        int j=1;
        for(int i=1;i<n;i++){
           
                if(nums[i]!=nums[i-1]){
                 temp[j]=nums[i];
                j++;
                }
            

        }
        for(int i=0;i<j;i++){
            nums[i]=temp[i];
        }
        return j;
    }
}