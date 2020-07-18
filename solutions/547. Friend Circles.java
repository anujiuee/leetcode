class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        int a [] = new int [n];
        
        for (int i=0;i<n;i++){
            a[i]=i;
        }
        
        for (int i=0;i<n;i++){
           for (int j=i+1;j<n;j++){
               if(M[i][j]==1){
                   union(a,i,j);
               }
           }
        }
        
        
        Set<Integer> result = new HashSet();
        for(int i=0;i<n;i++){
            result.add(root(a,i));
        }
        
        return result.size();
            
    }
    
    public void union(int a [],int u,int v){
        int m  = root(a,u);
        int n =  root(a,v);
        a[m]=a[n];
    }
    
    public int root(int a[],int m){
        
        while(a[m]!=m){
            m=a[m];
        }
        return m;
    }
}

/*
class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        boolean visited [] = new boolean [n];
        
        int count =0;
        
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
            bfs(visited,M,i);
                count++;
            }
        }
        
        return count;
    }
    
    public void bfs(boolean [] visited ,int[][] M,int u){
        Queue < Integer > q = new LinkedList < > ();

        q.add(u);
        visited[u]=true;
        
        while(!q.isEmpty()){
            int m = q.remove();
                for(int j=0; j<M.length; j++){
                if(M[m][j] == 1 && !visited[j]){
                    visited[j]=true;
                     q.add(j);
                }
          }
        }
        
    
    }
}
*/

/*
class Solution {
    public int findCircleNum(int[][] M) {
        int n = M.length;
        
        DisjointSet ds = new DisjointSet();
        for(int i=0; i<n; i++){
            ds.makeSet(i);
        }
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(M[i][j] == 1)
                    ds.union(i, j);
            }
        }
        Set<Integer> result = new HashSet();
        for(Integer val : ds.map.keySet()){
            result.add(ds.findSet(val));
        }
        
        return result.size();
    }
    
    class DisjointSet {

    private Map<Integer, Node> map = new HashMap<>();

    class Node {
        int data;
        Node parent;
        int rank;
    }

    /**
     * Create a set with only one element.
     */
    public void makeSet(int data) {
        Node node = new Node();
        node.data = data;
        node.parent = node;
        node.rank = 0;
        map.put(data, node);
    }

    /**
     * Combines two sets together to one.
     * Does union by rank
     *
     * @return true if data1 and data2 are in different set before union else false.
     */
    public boolean union(int data1, int data2) {
        Node node1 = map.get(data1);
        Node node2 = map.get(data2);

        Node parent1 = findSet(node1);
        Node parent2 = findSet(node2);

        //if they are part of same set do nothing
        if (parent1.data == parent2.data) {
            return false;
        }

        //else whoever's rank is higher becomes parent of other
        if (parent1.rank >= parent2.rank) {
            //increment rank only if both sets have same rank
            parent1.rank = (parent1.rank == parent2.rank) ? parent1.rank + 1 : parent1.rank;
            parent2.parent = parent1;
        } else {
            parent1.parent = parent2;
        }
        return true;
    }

    /**
     * Finds the representative of this set
     */
    public int findSet(int data) {
        return findSet(map.get(data)).data;
    }

    /**
     * Find the representative recursively and does path
     * compression as well.
     */
    private Node findSet(Node node) {
        Node parent = node.parent;
        if (parent == node) {
            return parent;
        }
        node.parent = findSet(node.parent);
        return node.parent;
    }
    }
}
*/
