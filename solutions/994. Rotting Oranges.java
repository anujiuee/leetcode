        while(!q.isEmpty()){
            
            int size = q.size();
            
            time++;
            
          //   boolean exist = false;
​
            
            for(int t=0;t<size;t++){
                
                int [] k = q.poll();
                int i = k[0];
                int j = k[1];
                                
                
                if(i+1<n && grid[i+1][j]==1){
                    q.add(new int []{i+1,j});
                    grid[i+1][j]=2;
                    count--;
                   // exist = true;
                }
                
                if(j+1<m && grid[i][j+1]==1){
                    q.add(new int []{i,j+1});
                    grid[i][j+1]=2;
                    count--;
                    //exist = true;
                }
                
                if(i-1>=0 && grid[i-1][j]==1){
                    q.add(new int []{i-1,j});
                    grid[i-1][j]=2;
                    count--;
                  //   exist = true;
                }
                
                if(j-1>=0 && grid[i][j-1]==1){
                    q.add(new int []{i,j-1});
                    grid[i][j-1]=2;
                    count--;
                    // exist = true;
                }
                
                
            }
            
             //if(exist) time++;
            
            
        }
        
        
        if(time==-1 && count==0) return 0;
        if(count==0) return time-1;
        
        return -1;
        
