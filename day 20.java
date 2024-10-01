class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long result;
        long mod = 1000000007;
        Node temp1 = first;
        Node temp2 = second;
        
        long num1 = 0;
        long num2 = 0;
        
        while(temp1 != null || temp2 != null){
            if(temp1 != null){
                num1 = (num1*10 + temp1.data) % mod;
                temp1 = temp1.next;
            }
            
            if(temp2 != null){
                num2 = (num2*10 + temp2.data) % mod;
                temp2 = temp2.next;
            }
            
        }
        
        result = (num1 * num2) % mod;
        return result;
        
    }
}