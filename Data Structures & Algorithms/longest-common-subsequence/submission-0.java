class Solution {
    public int longer(String s1 ,String s2 , int i1 , int i2,int[][] store ){
        //Base 
        if ( i1 < 0 || i2 < 0) return 0;

        if (store[i1][i2] != -1) return store[i1][i2];
        if (s1.charAt(i1) == s2.charAt(i2)){
            //adding this and removing else
            return store[i1][i2]=  1 + longer(s1,s2, i1-1, i2-1, store);
        } else {
            // here check which path gives us the max
            return store[i1][i2] = Math.max(longer(s1, s2, i1-1, i2, store), longer(s1, s2, i1, i2-1, store));
        }
    }
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] length = new int[t1.length()+1][t2.length()+1];
        for (int[] arr: length){
            Arrays.fill(arr,-1);
        }
        return longer(t1 ,t2 , t1.length()-1 , t2.length()-1,length);
    }
}
