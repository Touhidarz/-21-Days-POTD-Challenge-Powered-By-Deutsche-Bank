class Solution{
    static int maxLength(String s){
        // code here
        Stack <Integer> st = new Stack<>();
        int count=0;
        
        st.push(-1);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else{
                st.pop();

                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    count = Math.max(count, i-st.peek());
                }
            }
        }
        return count;
    }
}