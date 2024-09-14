class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> posInt = new ArrayList<>();
        ArrayList<Integer> negInt = new ArrayList<>();
        for(int i = 0 ;i<arr.size(); i++){
            if(arr.get(i)>=0){
                posInt.add(arr.get(i));
            }
            else{
                negInt.add(arr.get(i));
            }
        }
        arr.clear();
        int i=0, j=0, k=0;
        
        while(i<posInt.size() && j<negInt.size()){
            if(k%2 == 0){
                arr.add(posInt.get(i));
                i++;
            }
            else{
                arr.add(negInt.get(j));
                j++;
            }
            
            k++;
        }
        
        while (i < posInt.size()) {
            arr.add(posInt.get(i));
            i++;
        }
    
        while (j < negInt.size()) {
            arr.add(negInt.get(j));
            j++;
        }
        
        
    }
}