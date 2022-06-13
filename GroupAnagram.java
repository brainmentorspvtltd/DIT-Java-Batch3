class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        if(strs.length==0){
            return new ArrayList();
        }
        for(String s: strs ){
           char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr); // char array convert into String
            if(!map.containsKey(key)){
                    map.put(key, new ArrayList());
                }
            map.get(key).add(s); 
            
            
}
     return new ArrayList(map.values());   
      
}
}
