class Solution {
    public int[] sortedSquares(int[] nums) {

        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        int i, j;

        // Separate negatives and positives
        for(i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                neg.add(nums[i]);
            }else{
                pos.add(nums[i]);
            }
        }

        // Square negatives
        for(i = 0; i < neg.size(); i++){
            neg.set(i, neg.get(i) * neg.get(i));
        }

        // Square positives
        for(i = 0; i < pos.size(); i++){
            pos.set(i, pos.get(i) * pos.get(i));
        }

        // Reverse negatives
        Collections.reverse(neg);

        i = 0;
        j = 0;

        // Merge
        while(i < neg.size() && j < pos.size()){
            if(neg.get(i) <= pos.get(j)){
                res.add(neg.get(i));
                i++;
            }else{
                res.add(pos.get(j));
                j++;
            }
        }

        while(i < neg.size()){
            res.add(neg.get(i));
            i++;
        }

        while(j < pos.size()){
            res.add(pos.get(j));
            j++;
        }

        int[] ans = new int[res.size()];
        for(i = 0; i < res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
    }
}