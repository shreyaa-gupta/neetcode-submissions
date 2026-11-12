class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(indexMap.containsKey(nums[i])){
                res[0] = indexMap.get(nums[i]);
                res[1] = i;
            } else {
                indexMap.put(target - nums[i], i);
            }
        }
        return res;
    }
}
