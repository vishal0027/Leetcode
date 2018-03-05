public class Solution {
    // you need to treat n as an unsigned value
    // 
    public static int hammingWeight(int n) {
         int counter = 0;
          for(int i = 0; i < 32; i++ ){
            int mask =  1 << i;
            int masked_n = n & mask;
            int thebit = masked_n >>> i;
            if(thebit == 1){
                counter++;
            }
        }
        return counter;
    }
}