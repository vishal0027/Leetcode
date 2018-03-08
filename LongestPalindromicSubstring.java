/* -----------------------------------
 *  Longest Palindromic Sequence
 * -----------------------------------
 */

public class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if(s.length() == 1){
            return s;
        }
        int len = s.length();                   
        String result = null;
        boolean[][] dp = new boolean[len][len];  
          for (int i = len - 1; i >= 0; i--) {
            for (int j = i; j < len; j++) {
              dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);
              if (dp[i][j] && (result == null || j - i + 1 > result.length())) {
                result = s.substring(i, j + 1);
              }
            }
          }
        return result;
    }
}

public class MainClass {
    public static String stringToString(String input) {
        if (input == null) {
            return "null";
        }
        return Json.value(input).toString();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);
            
            String ret = new Solution().longestPalindrome(s);
            
            String out = (ret);
            
            System.out.print(out);
        }
    }
}