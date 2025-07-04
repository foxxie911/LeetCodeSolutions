class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
       var map = new HashMap<Integer, Integer>();
       List<Integer>[] count = new List[nums.length + 1];
       
       for(int f = 0; f < count.length; f++){
        count[f] = new ArrayList<Integer>();
       }
       
       for(int i : nums){
        map.put(i, map.getOrDefault(i, 0) + 1); 
       }

       for(Map.Entry<Integer, Integer> mapEntry : map.entrySet()){
        count[mapEntry.getValue()].add(mapEntry.getKey());
       }
       
       int[] result = new int[k];
       int index = 0;
       for(int i = count.length - 1; i > 0 && index < k; i--){
        for(int n : count[i]){
            result[index++] = n;
            if(index == k){
                return result;
            }
        }
       }
       return result;
    }
}
