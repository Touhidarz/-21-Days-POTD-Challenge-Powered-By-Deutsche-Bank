class Solution {
    static Node constructMatr(int arr[][], int i, int j){
        if(i>=arr.length || j>=arr[0].length){
            return null;
        }
        Node temp = new Node(arr[i][j]);
        
        temp.right = constructMatr(arr, i, j+1);
        temp.down = constructMatr(arr, i+1, j);
        
        return temp;
    }
    
    static Node construct(int arr[][]) {
        // Add your code here.
        return constructMatr(arr, 0, 0);
    }
}da