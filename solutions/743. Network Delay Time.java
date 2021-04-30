class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        
        Map<Integer, List<int[]>> graph = new HashMap();
        
        for (int[] edge: times) {
            if (!graph.containsKey(edge[0]))
                graph.put(edge[0], new ArrayList<int[]>());
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }
        
        
        
        PriorityQueue<int []> queue = new PriorityQueue<int[]>((x,y)->x[1]-y[1]);
        
        
        int dis [] = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        
        //boolean visited [] = new boolean[n+1];
        
        
        queue.add(new int []{k,0});
        //dis[k]=0;
        
        while(!queue.isEmpty()){
            
            int top [] = queue.poll();
            if(dis[top[0]]!=Integer.MAX_VALUE) continue;
            
            dis[top[0]]=top[1];
            
            
            int index = top[0];
            int value = top[1];
            List<int[]> near = graph.get(index);
            if(near==null) continue;
            
            for (int i=0;i<near.size();i++){
                
                if(near.get(i)[1]+value<dis[near.get(i)[0]]){
                    //dis[near.get(i)[0]]=near.get(i)[1]+value;
                    queue.add(new int []{near.get(i)[0],near.get(i)[1]+value});
                }
                
                
            }
            
            
            
        }
        
        
        int ans = 0;
        for (int i=1;i<n+1;i++){
            if(dis[i]==Integer.MAX_VALUE) return -1;
            ans = Math.max(ans,dis[i]);
        }
        
        
        return ans;
    }
}
