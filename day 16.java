class Solution {
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {
            // Remove indices that are out of the current window
            if (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove elements from the back of the deque that are less than the current element
            while (!deque.isEmpty() && arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            // Add the current element index to the deque
            deque.offer(i);

            // The first k-1 elements do not have a complete window
            if (i >= k - 1) {
                // The front of the deque is the index of the maximum element for the current window
                ans.add(arr[deque.peek()]);
            }
        }

        return ans;
    }
}
