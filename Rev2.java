import java.util.Stack;

class Rev2 {
    public String reverseWords(String s) {
        Stack<String>st=new Stack<>();
        String r="";
        for(int i=0;i<s.length();i++){
            String word="";
            while( i<s.length() && s.charAt(i)!=' ' ){

                word+=s.charAt(i);
                i++;
            }
            if(word.length()>0){
            st.push(word);
            }
        }
        while(!st.empty()){
           r=r+st.peek()+" ";
            st.pop();

        }

        return r.trim()
    }
}
