class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        boolean [] isVisited = new boolean[n];
        Queue<Integer> q = new LinkedList();
        q.add(start);
       // isVisited[start]=true;
        
        while(!q.isEmpty()){
            int k = q.peek();
            if(arr[k]==0) return true;
             isVisited[k]=true;
            q.remove();
            if(k+arr[k]<n && !isVisited[k+arr[k]]){
               q.add(k+arr[k]); 
            }
            
             if(k-arr[k]>-1 && !isVisited[k-arr[k]]){
               q.add(k-arr[k]); 
            }
        }
        
        
        return false;
        
    }
}