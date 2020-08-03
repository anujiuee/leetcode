class Solution {
    public boolean isPalindrome(String s) {
        
        int i=0;
            int j = s.length()-1;
        
        while(i<j){
            while(!(('a'<=s.charAt(i) && s.charAt(i)<='z') ||('A'<=s.charAt(i) && s.charAt(i)<='Z') || ('0'<=s.charAt(i) && s.charAt(i)<='9')))
            {
                i++;
                if(i>j) return true;
            }
            
             while(!(('a'<=s.charAt(j) && s.charAt(j)<='z') ||('A'<=s.charAt(j) && s.charAt(j)<='Z') || ('0'<=s.charAt(j) && s.charAt(j)<='9')))
            {
                j--;
                 if(i>j) return true;
            }
            
            
            if(Character.toLowerCase(s.charAt(i))==Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }
            else return false;
            
        }
        
        return true;
        
    }
}
