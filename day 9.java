class Solution {
    // Returns count buildings that can see sunlight
    public int countBuildings(int[] height) {
        // code here
        int max = height[0];
        int count = 1;
        
        for(int i=1; i<height.length; i++){
            if(height[i]>max ){
                count ++;
                max = height[i];
            }
            
        }
        return count;
    }
}