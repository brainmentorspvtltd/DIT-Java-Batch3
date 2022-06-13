class Solution {
    public int lengthOfLongestSubstring(String s) {
        //"abcabcbb"
        // Do Sliding + Maintain the Frequency of character
        int i = 0;
        int j = 0;
        int max = 0;
        int []hashset = new int[128]; // default fill with 0
        while(j<s.length()){
            char singleChar = s.charAt(j);
            hashset[singleChar]++; // hashSet[AsciiValueOfChar] hashset['a'] hashset[97]++ = 0 +1
            while(hashset[singleChar]>1){ // Character Appear more than one
                char leftChar = s.charAt(i); 
                hashset[leftChar]--; 
                i++; // Slide the Window (Left to Right Move)
}
            max = Math.max(max, j-i+1);
            j++;
            
            
        }
        return max;
    }
}
