class Solution {
    int answer = 0;
    public void expand(String s , int li , int ri){
        while (li >=0 && ri<s.length() && s.charAt(li)==s.charAt(ri)){
            answer++;
            ri++;
            li--;
        }
    }
    public int countSubstrings(String s) {
        for (int i=0 ; i<s.length() ; i++){
            expand(s,i,i);
            expand(s,i,i+1);
        }

        return answer;
    }
}
