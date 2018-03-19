class Solution {
     public int removeDuplicates(int[] arr) {
        int len = arr.length;
        if(len == 0){
            return 0;
        }
        int result = 1;
        for(int i=1, j=len;i<j;i++){
            if(arr[i] != arr[i-1]){
                arr[result++] = arr[i];
                //result ++;
            }
        }
        return result;
    }
}