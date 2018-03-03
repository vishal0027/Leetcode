class Solution {
        public int lengthOfLongestSubstring(String s) {
             if(2 > s.length()){
                 return s.length();
             }
             int len = s.length();
             Set<Character> container = new HashSet<Character>();
             int max = 0, i = 0, j = 0;
             while (i < len && j < len) {
                 if (!container.contains(s.charAt(j))){
                       container.add(s.charAt(j++));
                      max = Math.max(max, j - i);
                 }
                 else {
                        container.remove(s.charAt(i++));
                 }
             }
                return max;
    }
}