class Solution {
    public List<String> findWords(char[][] board, String[] words) {
        
        int n = words.length;
        
        List<String> ans = new ArrayList();
        
        for (int i=0;i<n;i++){
            for (int u=0;u<board.length;u++){
               for (int v=0;v<board[0].length;v++){
                if(dfs(board,0,words[i],u,v)) {ans.add(words[i]);break;}
            } 
                if(ans.size()>0)
                if(ans.get(ans.size()-1)==words[i]) break;
            }
            
        }
        
        return ans;
    }
    
    public boolean dfs(char[][] board, int index, String word,int i ,int j){
        
        if(index == word.length()) return true;
​
        if(i>=board.length || i<0) return false;
        
        if(j>=board[0].length || j<0) return false;
                
        if(board[i][j] != word.charAt(index)) return false;
        
        char m = board[i][j];
        
        board[i][j] = '0';
        
            
        if(dfs(board,index+1,word,i+1,j) || 
          dfs(board,index+1,word,i,j+1) ||
          dfs(board,index+1,word,i-1,j) ||
          dfs(board,index+1,word,i,j-1)) {
             board[i][j] = m;
            return true;
        }
        
        board[i][j] = m;
        return false;
​
