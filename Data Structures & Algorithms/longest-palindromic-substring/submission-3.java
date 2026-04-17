class Solution {
    public boolean isPallindrome(String r){
        int len = r.length()-1;
        for (int i=0 ; i< len/2+1 ; i++){
            if (r.charAt(i) != r.charAt(len-i)){
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s.length()==1){
            return s;
        }
        int len = Integer.MIN_VALUE;
        String ans = "";
        for (int i=0; i <= s.length() ; i++){
            for (int j=i+1; j <= s.length(); j++){
                String a = s.substring(i,j);
                if (isPallindrome(a)){
                    if (len<a.length()){
                        ans = a;
                        len = a.length();
                    }
                }
            }
        }
        return ans;
    }
}
