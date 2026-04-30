class Solution {
    public boolean oneStep(String s1 , String s2, String s3, int i1 , int i2, Boolean[][] dp){
        if (i1 == s1.length() && i2 == s2.length()){
            return true;
        }
        if (dp[i1][i2] != null) return dp[i1][i2];
        int s3l = i1+i2;
        boolean t1 = false , t2= false;
        if (i1 < s1.length() && s1.charAt(i1)==s3.charAt(s3l)){
            if (oneStep(s1,s2,s3,i1+1,i2, dp)){
                t1 = true;
            }
        }

        if (i2 < s2.length() && s2.charAt(i2)==s3.charAt(s3l)){
            if (oneStep(s1,s2,s3,i1,i2+1, dp)){
                t2=  true;
            }
        }

        return dp[i1][i2] = t1 || t2;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        Boolean[][] dp = new Boolean[s1.length()+1][s2.length()+1];
        if (s1.length()+s2.length() != s3.length()) return false;
        return oneStep(s1,s2,s3,0,0 , dp);
    }
}
