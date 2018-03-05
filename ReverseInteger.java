class Solution {
    public int reverse(int x) {
        int modulo;
        int sign = 1;
        int result = 0;
        if(x<0){
            x = Math.abs(x);
            sign = -1;
        }
        if(x != 0){
           int num[] = new int[(int) (Math.log10(x) + 1)];
            for(int i =0; i<num.length; i++){
                 modulo =  x % 10;
                 num[i] = modulo;  
                 x /= 10;
                 }
             for(int i = 0; i < num.length; i++){
                 if(result >= 0){
                     if(Integer.MAX_VALUE - result >= (int)(num[i]*Math.pow(10,(num.length-i-1)))){
                         result = result + (int)(num[i]*Math.pow(10,(num.length-i-1)));
                     }else{
                         return 0;
                     }
                 }
                
             }
        }else{
            
            result = 0;
        }
        
        return (sign*result);
    }
}