class Solution {
    int index = 0;
    int length = 0;

    public void expand(String r, int li, int ri) {
        while (li >= 0 && ri < r.length() &&
               r.charAt(li) == r.charAt(ri)) {

            if (ri - li + 1 > length) {
                index = li;
                length = ri - li + 1;
            }

            li--;
            ri++;
        }
    }

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            expand(s, i, i);       // odd
            expand(s, i, i + 1);   // even
        }
        return s.substring(index, index + length);
    }
}