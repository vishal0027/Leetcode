class Solution {
     public int mySqrt(int x) {
         int res = 0;
         int bit = 1 << 30;
         while (bit > x)
            bit >>= 2;

        while (bit != 0) {
            if (x >= res + bit) {
                 x -= res + bit;
                 res = (res >> 1) + bit;
            } else
            res >>= 1;
            bit >>= 2;
         }
    return res;
    }   
}