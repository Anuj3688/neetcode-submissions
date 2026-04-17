class Solution {
    int[] choice;
    public int numDecodings(String s) {
        choice = new int[s.length()+1];
        Arrays.fill(choice,-1);
        return helper(s, 0);
    }

    public int helper(String s, int i) {
        // base case
        if (i == s.length()) return 1;

        if (s.charAt(i) == '0') return 0;
        if (choice[i] != -1){
            return choice[i];
        }
        // take 1 digit
        int ways = helper(s, i + 1);
     
    
        if (i + 1 < s.length()) {
            int num = (s.charAt(i) - '0') * 10 
                    + (s.charAt(i + 1) - '0');

            if (num <= 26) {
                ways += helper(s, i + 2);
            }
        }

        return choice[i] = ways;
    }
}