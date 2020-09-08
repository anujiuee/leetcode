class Solution {
    public boolean equationsPossible(String[] eq) {
        
        int arr [] = new int [26];
        
        for (int i=0;i<26;i++){
           arr[i]=i;
            }
        
        for (int i=0;i<eq.length;i++){
            char a = eq[i].charAt(0);
            char b = eq[i].charAt(3);
            char c = eq[i].charAt(1);
            if(c=='='){
                union(arr,a-'a',b-'a');
            } 
        }
        
      
        
        for (int i=0;i<eq.length;i++){
            char a = eq[i].charAt(0);
            char b = eq[i].charAt(3);
            char c = eq[i].charAt(1);
            if(c=='!'){
               if(find(arr,a-'a',b-'a')) return false;
            } 
        }
        
        return true;
        
        
        
    }
    
    public int root(int [] ch,int a){
        int i = ch[a];
        
        while(i!=ch[i]){
            i=ch[i];
        }
        return i;
    }
    
     public boolean find(int [] ch,int a,int b) {
            int root_a = root(ch,a);
            int root_b = root(ch,b);
            
            if(root_a==root_b) return true;
            else return false;
            
​
        }
    
        public void union(int [] ch,int a,int b) {
            int root_a = root(ch,a);
            int root_b = root(ch,b);
            
            ch[root_a]=root_b;
            
​
        }
​
}
