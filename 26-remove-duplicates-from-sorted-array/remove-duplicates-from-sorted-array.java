class Solution {
    public int removeDuplicates(int[] nums) {
        int officer = 0, cm = 1, k = 1;
        while(cm < nums.length){
            if(nums[cm] == nums[cm-1]){
                cm++;
                continue;
            }
            else{
                officer++;
                nums[officer] = nums[cm];
                k++;
                cm++;
            }
        }
        return k;
    }
}