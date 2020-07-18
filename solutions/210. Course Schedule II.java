class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int n = numCourses;
        if(prerequisites.length==0){
             int ans [] = new int [n];
              for (int i=0;i<n;i++){
            ans[i]=i;
        }
            return ans;
        }
        
        
        List a [] = new List [n];
        
        for (int i=0;i<n;i++){
            a[i]=new ArrayList();
        }
        
        for (int i=0;i<prerequisites.length;i++){
            a[prerequisites[i][1]].add(prerequisites[i][0]);
            
        }
        
        Stack<Integer> s = new Stack();
        
        boolean visited [] = new boolean[n];
        
        boolean isCycle [] = new boolean[n];
        
        for (int i=0;i<n;i++){
           if(!visited[i]) {
               if(!dfs(s,a,i,visited,isCycle)) return new int [0];
           }
        }
        
        int ans [] = new int [n];
        int i=0;
        
        while(s.size()!=0){
            ans[i]=s.pop();
            i++;
        }
        
        return ans;
    }
    
    public boolean dfs(Stack<Integer> s,List a [],int index,boolean visited [],boolean isCycle []){
        
        if(isCycle[index]) return false;
        
        if(visited[index]) return true;;
        
        visited[index] = true;
        
        isCycle[index]= true;
        
        List<Integer> ni = a[index];
        
        for (int i=0;i<ni.size();i++){
              if(!dfs(s,a,ni.get(i),visited,isCycle)) return false;;
        }
        
        s.add(index);
        
        isCycle[index]= false;
        
        return true;
    }
}