class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return new ArrayList();
        Map<Character,List<Character>> m = new HashMap();
        
       m.put('1',new ArrayList());
       m.put('2',new ArrayList(){{add('a');add('b');add('c');}});
       m.put('3',new ArrayList(){{add('d');add('e');add('f');}});
       m.put('4',new ArrayList(){{add('g');add('h');add('i');}});
        m.put('5',new ArrayList(){{add('j');add('k');add('l');}});
        m.put('6',new ArrayList(){{add('m');add('n');add('o');}});
        m.put('7',new ArrayList(){{add('p');add('q');add('r');add('s');}});
         m.put('8',new ArrayList(){{add('t');add('u');add('v');}});
         m.put('9',new ArrayList(){{add('w');add('x');add('y');add('z');}});
          m.put('*',new ArrayList(){{add('+');}});
        m.put('0',new ArrayList(){{add('&');}});
         m.put('!',new ArrayList(){{add('#');}});
        
        List<String> ans = new ArrayList();
        
        letterCombinations(0,digits,ans,"",m);
        
        return ans;
    }
    
     public void letterCombinations(int start,String digits,List<String> ans, String curr,                       Map<Character,List<Character>> m){
         
         if(start==digits.length()){
             ans.add(curr);
             return;
         }
         
         List<Character> l = m.get(digits.charAt(start));
         for (int i=0;i<l.size();i++){
             letterCombinations(start+1,digits,ans,curr+l.get(i),m);
         }
         
         
     }
}