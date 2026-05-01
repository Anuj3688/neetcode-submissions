class Solution {
    public int minChange(String word1 , String word2 , int i1 , int i2, int[][] dp){
        //min number of change
        // so we have 3 choice and based on that we need to move forward.
        // in all there we can do any and see which operation works best 1 by 1

        //base case
        if (i1 == word1.length()) {
            return word2.length() - i2; // insert all remaining chars
        }
        if (i2 == word2.length()) {
            return word1.length() - i1; // delete all remaining chars
        }

        if (dp[i1][i2] != -1){
            return dp[i1][i2];
        }
        if (i2 < word2.length() && i1 < word1.length() && word1.charAt(i1) == word2.charAt(i2)){
            // since it is a match no operation needed moving for next character
            return dp[i1][i2] = minChange(word1, word2 , i1+1 , i2+1, dp);
        }
        //now since it is not match we have 3 choice so will try them all
        // check also need to be added
        int choiceIn = Integer.MAX_VALUE;
        int choiceRe = Integer.MAX_VALUE;
        int choiceDe = Integer.MAX_VALUE;

        if (i2<word2.length())
            choiceIn = 1 + minChange(word1 , word2 , i1,  i2+1 ,dp);
        if (i2<word2.length() && i1< word1.length())
            choiceRe = 1 + minChange(word1 , word2 , i1+1,  i2+1 , dp);
        if (i1< word1.length())
            choiceDe = 1 + minChange(word1 , word2 , i1+1,  i2, dp);

        return dp[i1][i2]= Math.min(choiceIn , Math.min(choiceRe , choiceDe));
    }
    public int minDistance(String word1, String word2) {
        //now dp it
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for (int[] arr : dp) Arrays.fill(arr,-1);
        return minChange(word1,word2,0,0 , dp);
    }
}
