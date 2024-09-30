class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    void inOrder(ArrayList<Integer> Arr, Node root){
        if(root==null) return;
        inOrder(Arr, root.left);
        Arr.add(root.data);
        inOrder(Arr, root.right);
    }
    
    ArrayList<Integer> mergeArr(ArrayList<Integer> Arr1, ArrayList<Integer> Arr2){
        ArrayList<Integer> result = new ArrayList<>();
        
        int n1 = Arr1.size();
        int n2 = Arr2.size();
        int i=0; 
        int j=0;
        
        while(i<n1 && j<n2){
            if(Arr1.get(i) <= Arr2.get(j)){
                result.add(Arr1.get(i));
                i++;
            }
            else{
                result.add(Arr2.get(j));
                j++;
            }
        }
        while(i<n1){
            result.add(Arr1.get(i));
            i++;
        }
        while(j<n2){
            result.add(Arr2.get(j));
            j++;
        }
        
        return (result);
    }
    
    public List<Integer> merge(Node root1, Node root2) {
        // Write your code here
        
        ArrayList<Integer> Arr1 = new ArrayList<>();
        ArrayList<Integer> Arr2 = new ArrayList<>();

        inOrder(Arr1, root1);
        inOrder(Arr2, root2);
        
        
        
        
        return mergeArr(Arr1, Arr2);
    }
}