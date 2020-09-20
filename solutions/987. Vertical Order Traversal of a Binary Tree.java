    
    class Node implements Comparable<Node>{
    int w, d, val;
    Node(int w, int d, int val) {
        this.w = w;
        this.d = d;
        this.val = val;
    }
         @Override
    public int compareTo(Node that) {
        //if (this.w != that.w)
        //    return Integer.compare(this.w, that.w);
         if (this.d != that.d)
            return Integer.compare(this.d, that.d);
        else
            return Integer.compare(this.val, that.val);
    }
    }
   
    
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList();
        TreeMap<Integer, List<Node>> map = new TreeMap();
        helper(root, map, 0, 0);
        
        for (Map.Entry<Integer,List<Node>> entry : map.entrySet()){
            
            List<Node> list = entry.getValue();
            Collections.sort(list);
            
            
           List<Integer> l = new ArrayList();
        for(Node n: list){
            l.add(n.val);
        }
        
        result.add(l);
        //System.out.print(map);
          
        }
       
        return result;
    }
    
    void helper(TreeNode node, TreeMap<Integer, List<Node>> map, Integer w, Integer d){
        
        if(node == null)
            return;
        
        if(map.get(w) == null){
            Node n = new Node(w, d, node.val);
            List<Node> list = new ArrayList();
            list.add(n);
            map.put(w, list);
        } else{
            Node n = new Node(w, d, node.val);
            List<Node> temp = map.get(w);
            temp.add(n);
            map.put(w, temp);
        }
        
        helper(node.left, map, w-1, d+1);
        helper(node.right, map, w+1, d+1);
    }
}
