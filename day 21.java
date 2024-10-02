class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int k = 1;
        int n = arr.size();
        
        while(k<n){
            Collections.rotate(arr, 1);
            arr.remove(n-k);
            n = arr.size();
            k++;
        }
        
        return arr.get(0);
    }
}