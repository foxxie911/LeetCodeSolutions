class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> nonDup = new HashSet<Integer>();
        for(int i : nums){
            if(nonDup.contains(i)){
                return true;
            }
            nonDup.add(i);
        }
        return false;
    }
}