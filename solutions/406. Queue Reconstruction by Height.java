class Solution {
    public int[][] reconstructQueue(int[][] people) {
        
        
        /*
        public int[][] reconstructQueue(int[][] people) {
    Arrays.sort(people, new Comparator<int[]>() {
      @Override
      public int compare(int[] o1, int[] o2) {
        // if the heights are equal, compare k-values
        return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
      }
    });
​
    List<int[]> output = new LinkedList<>();
    for(int[] p : people){
      output.add(p[1], p);
    }
​
    int n = people.length;
    return output.toArray(new int[n][2]);
  }
        
        */
        
        int m = people.length;
    if(m==0) return new int[m][2];
     int n = people[0].length;
      
        
        Arrays.sort(people,(a1, a2) -> ((a1[0] - a2[0])));
       
        
        
        
     int ans [][] = new int[m][n];
         for (int i=0;i<m;i++){
            for (int j=0;j<n;j++)
            {
                ans[i][j]=-1;
            }
        }
        
      
    for (int i=0;i<m;i++){
        
        int h = people[i][0];
        int k = people[i][1];
        
        int count =0;
        
        for (int j=0;j<m;j++){
         if(count==k && ans[j][0]==-1) {ans[j][0]=h;
                       ans[j][1]=k;
                       break;}
         if(ans[j][0]==-1 || ans[j][0]==h) count++;
        }
                    
           
        }
        
     
        
        
    return ans;
    }
}
