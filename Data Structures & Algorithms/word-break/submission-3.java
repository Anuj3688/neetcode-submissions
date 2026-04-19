class Solution {
    Boolean[] ans;
    public boolean words(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }
        if (ans[s.length()] != null){
            return ans[s.length()];
        }

        for (int i = 0; i < wordDict.size(); i++) {
            String word = wordDict.get(i);

            // ONLY check prefix
            if (s.startsWith(word)) {
                String remaining = s.substring(word.length());
                if (words(remaining, wordDict)) {
                    ans[s.length()] = true;
                    return true;
                }
            }
        }
        ans[s.length()] = false; 
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        ans = new Boolean[s.length()+1];
        return words(s , wordDict );
    }
}
