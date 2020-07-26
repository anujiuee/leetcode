class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        
        List<List<Integer>> arr = new ArrayList();
        
        List<Integer> a = new ArrayList();
        a.add(0);
         recursion(graph,0,a,arr);
        
        return arr;
        
    }
    
    public void recursion(int[][] graph,int index,List<Integer> a,List<List<Integer>> arr){
        if(index==graph.length-1){
           // a.add(graph.length-1);
            arr.add(new ArrayList(a));
           // a.remove(a.size()-1);
            return ;
        }
        
        int [] nei = graph[index];
        
        for (int i=0;i<nei.length;i++){
            a.add(nei[i]);
            recursion(graph,nei[i],a,arr);
            a.remove(a.size()-1);
        }
        
    }
    
    
}
