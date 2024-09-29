class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int count=0;
        for(int i=0; i<arr.length; i++){
            count += arr[i]/k;
            if(arr[i]%k != 0){
                count++;
            }
        }
        return count;
    }
}