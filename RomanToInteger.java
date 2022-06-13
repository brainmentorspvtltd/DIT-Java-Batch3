class Solution {
    public int romanToInt(String romanNumber) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        // Scan RomanNumber String from Left to Right
        int i = 0;
        int sum = 0;
        while(i<romanNumber.length()){
            char singleChar = romanNumber.charAt(i);  // Get the Single Char from the String
            String currentSymbol = String.valueOf(singleChar); // Convert char into String
            int currentValue = map.get(currentSymbol);  // map based on key get the value
            int nextValue = 0;
            if(i+1<romanNumber.length()){
                char nextChar = romanNumber.charAt(i+1);  // Get the Single Char from the String
                String nextSymbol = String.valueOf(nextChar); // Convert char into String
                nextValue = map.get(nextSymbol);
            }
            if(currentValue<nextValue){
                sum = sum + (nextValue - currentValue);
                i= i+2;
            }
            else{
                sum = sum + currentValue;
                i=i+1;
}
            
        }
        return sum;
        
    }
}
