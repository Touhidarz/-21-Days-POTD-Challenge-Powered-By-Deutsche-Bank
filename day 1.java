
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        
        Node slow = head;
        Node fast = head;
        Node temp = head;
        int count = 0;
        
        while(temp != null){
            count ++;
            temp = temp.next;
        }
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(count %2 ==0){
            return slow.next.data;
        }
        else{
            return slow.data;
        }
        
        
    }
}
