class Solution {
    
    int max=Integer.MIN_VALUE;
    String result="";
    
    private int checkForPalindrome(String s, int start, int end){
        if(s.charAt(start) != s.charAt(end)) return 0;
        while(start>=0 && end <s.length() && s.charAt(start) == s.charAt(end)){
            start--;
            end++;
        }
        return end-start-1;
    }
    
    public String longestPalindrome(String s) {
        if(s.length()<2) return s;
        for(int i=0;i<s.length()-1;i++){
            int l1 = checkForPalindrome(s,i,i);
            int l2 = checkForPalindrome(s,i,i+1);
            int most = Math.max(l1,l2);
            if(most>max){
                max=most;
                result = s.substring(i-((most-1)/2), i+1+(most/2));
            }
        }
        return result;
    }
}