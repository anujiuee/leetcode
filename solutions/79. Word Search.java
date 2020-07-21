class Solution {
    public boolean exist(char[][] board, String word) {
        
        int n = board.length;
        int m = board[0].length;
        
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(search(board,word,i,j,0)) return true;
            }
        }
        
        return false;
    }
    
    public boolean search(char[][] board, String word,int i, int j,int index){
        
        
        if(index==word.length()) return true;
        
        if(i>=board.length || j>=board[0].length || i<0 || j<0) return false;
        
        if(board[i][j]=='0') return false;

        
       
        
        if(word.charAt(index)==board[i][j]){
            char ch = board[i][j];
              board[i][j]='0';
    if(
            search(board,word,i+1,j,index+1) ||
            search(board,word,i,j+1,index+1) ||
            search(board,word,i-1,j,index+1) ||
            search(board,word,i,j-1,index+1)) return true ;
            
            board[i][j]=ch;
            
        }
        
        return false;
    }
}