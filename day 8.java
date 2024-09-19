class Solution {
    // Function to reverse words in a given string.
    
    String reverseWords(String str) {
        
        StringBuilder s = new StringBuilder(str);
        Stack<String> st = new Stack<>();
    
        int start = 0;
    
        for (int i = 0; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == '.') {
                st.push(s.substring(start, i));
                start = i + 1; 
            }
        }
    
        StringBuilder result = new StringBuilder();
    
        while (!st.isEmpty()) {
            result.append(st.pop());
            if (!st.isEmpty()) {
                result.append("."); 
            }
        }
    
        return result.toString();
}

}