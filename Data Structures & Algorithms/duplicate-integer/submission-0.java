class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int x : nums){
            if(map.containsKey(x)){
                map.put(x , map.get(x) + 1);
            } else{
                map.put(x , 1);
            }
        }

        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
}