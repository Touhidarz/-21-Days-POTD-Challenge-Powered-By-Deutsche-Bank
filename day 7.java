class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder(x);
        char c, top;
        
        for (int i=0; i<str.length(); i++) {
            c = str.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } 
            else { 
                if (st.isEmpty()) {
                    return false;
                }
                
                top = st.peek();
                
                if ( (c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{') ) {
                    st.pop();
                } 
                else { 
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}
