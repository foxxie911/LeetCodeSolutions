class Solution {
    public int[] twoSum(int[] nums, int target) {
        var mappie = new HashMap<Integer, Integer>();
        for(int i = 0; i <= nums.length; i++){
            int rest = target - nums[i];
            if(mappie.containsKey(rest)) return new int[] {mappie.get(rest), i};
            mappie.put(nums[i], i);
        }

        return new int[] {};
    }
}
