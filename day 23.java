class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        // code here
        Stack<Node> st = new Stack<>();
        
        if(head == null || head.next == head){ // checking the single node list
            return head;
        }
        
        Node temp = head;       //pushing all nodes on the stack
         do {
            st.push(temp);
            temp = temp.next;
        } while (temp != head);
        
        head = st.pop();      //actual reversing the list
        temp = head;
        while(!st.isEmpty()){
            temp.next = st.pop();
            temp = temp.next;
        }
        temp.next = head;
        
        return head;
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        // If the list is empty, return null
        
        if(head == null) return null;
        
        Node temp = head;
        Node prev = null;
        
        if(head.data == key){     // when the key is the Head node to delete
            
            if(head.next == head){
                return null;
            }
            
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = head.next;
            return head;
        }
        
        temp = head;             //when else other nodes to be deleted
        while(temp.next != head){
            prev = temp;
            temp = temp.next;
            if(temp.data == key){
                prev.next = temp.next;
                return head;
            }
            
        }
        
        
        return head;
    }
}