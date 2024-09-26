class Solution {
    // Function to find maximum number of consecutive steps
    // to gain an increase in altitude with each step.
    public int maxStep(int arr[]) {
        // Your code here
        // Arrays.sort(arr);
        
        int count = 0;
        int maxi = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                count ++;
                
            }
            else{
                maxi = Math.max(count, maxi);
                count = 0;
            }
        }
        
        return Math.max(count, maxi);
        
    }
}