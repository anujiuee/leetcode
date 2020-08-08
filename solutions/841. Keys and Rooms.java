class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        boolean  visit [] = new boolean [rooms.size()];
        visit[0]=true;
        canVisit(rooms,visit);
        for (int i=0;i<visit.length;i++){
            if(visit[i]==false) return false;
        }
        return true;
    }
    
     
  void canVisit(List<List<Integer>> rooms, boolean  visit[]){
      Stack<Integer> stack = new Stack();
      
      stack.push(0);
      visit[0] = true;
      
      while(!stack.isEmpty()){
          Integer top = stack.pop();
          
          for(Integer a : rooms.get(top)){
              if(!visit[a]){
                  visit[a] = true;
                  stack.push(a);
              }
          }
      }
  }
}
