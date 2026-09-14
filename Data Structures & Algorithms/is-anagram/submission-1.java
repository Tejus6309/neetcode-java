class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> sMap = new HashMap<>();
        HashMap<Character , Integer> tMap = new HashMap<>();

        char[] sLetters = s.toCharArray();
        char[] tLetters = t.toCharArray();

        for(char x : sLetters){
            if(sMap.containsKey(x)){
                sMap.put(x , sMap.get(x) + 1);
            } else{
                sMap.put(x , 1);
            }
        }

        for(char x : tLetters){
            if(tMap.containsKey(x)){
                tMap.put(x , tMap.get(x) + 1);
            } else{
                tMap.put(x , 1);
            }
        }

        return sMap.equals(tMap);
    }
}