class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
        // if(head == null || head.next == null){
        //     return true;
        // }
        
        // Stack<Integer> st = new Stack<>();
        // Node temp = head;

        // while(temp != null){
        //     st.push(temp.data);
        //     temp = temp.next;
        // }

        // temp = head;
        // while(temp != null){
        //     if(temp.data != st.pop()){
        //         return false;
        //     }
        //     temp = temp.next;
        // }

        // return true;
        
        
        if (head == null || head.next == null) {
            return true;  // Empty list or a single node is always a palindrome
        }

        // Step 1: Find the middle of the linked list using slow and fast pointers
        Node slow = head;
        Node fast = head;
        
        // Move fast pointer twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the linked list
        Node secondHalfHead = reverseList(slow);

        // Step 3: Compare the first half and the reversed second half
        Node firstHalfHead = head;
        while (secondHalfHead != null) {
            if (firstHalfHead.data != secondHalfHead.data) {
                return false;  // Mismatch found, it's not a palindrome
            }
            firstHalfHead = firstHalfHead.next;
            secondHalfHead = secondHalfHead.next;
        }

        return true;  // No mismatches, the list is a palindrome
    }

    // Helper function to reverse the linked list
    private Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    
    }
}