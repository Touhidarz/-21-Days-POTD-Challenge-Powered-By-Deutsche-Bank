class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        boolean check[] = new boolean[n+1];
        int repeat = -1;
        int missing = -1;
        
        
        for(int i=0; i<arr.length; i++){
            if(check[arr[i]]){
                repeat = arr[i];
            }
            else{
                check[arr[i]] = true;
            }
        }
        
        for(int i=1; i<=n; i++){
            if(!check[i]){
                missing = i;
                break;
            }
        }
        
        return new int[]{repeat, missing};
    }
}