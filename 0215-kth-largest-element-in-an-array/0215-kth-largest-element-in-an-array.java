class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        int target=n-k;
        int l=0;
        int r=n-1;
        while(l<=r){
            int pivotIndex=partition(nums,l,r);
            if(target==pivotIndex){
                return nums[pivotIndex];
            }
            else if(pivotIndex<target){
                l=pivotIndex+1;
            }
            else{
                r=pivotIndex-1;
            }
        }
        return -1;
    }
    private int partition(int nums[],int l,int r){
        int pivot=nums[r];
        int i=l;
        for(int j=l;j<r;j++){
            if(nums[j]<pivot){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
        }
        int temp=nums[i];
        nums[i]=nums[r];
        nums[r]=temp;
        return i;
    }
}