        
        
        queue.add(new int []{k,0});
        dis[k]=0;
        
        while(!queue.isEmpty()){
            
            int top [] = queue.poll();
            if(visited[top[0]]) continue;
            
            visited[top[0]]=true;
            
            
            int index = top[0];
            int value = top[1];
            List<int[]> near = graph.get(index);
            if(near==null) continue;
            
            for (int i=0;i<near.size();i++){
                
                if(near.get(i)[1]+value<dis[near.get(i)[0]]){
                    dis[near.get(i)[0]]=near.get(i)[1]+value;
                    queue.add(new int []{near.get(i)[0],dis[near.get(i)[0]]});
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
