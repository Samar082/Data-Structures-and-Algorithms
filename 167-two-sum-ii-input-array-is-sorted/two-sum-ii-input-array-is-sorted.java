class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j = numbers.length;
        while(i<j) {
            int sum = numbers[i] + numbers[j-1];
            if (sum == target) {
                return new int[] { ++i, j };
            }
            else if(sum < target){
                i++;
            }
            else if(sum > target){
                j--;
            }

        }
        return new int[]{};
    }
}