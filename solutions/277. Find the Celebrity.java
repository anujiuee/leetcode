/* The knows API is defined in the parent class Relation.
      boolean knows(int a, int b); */

public class Solution extends Relation {
    public int findCelebrity(int n) {
        //boolean isPossible = true;
        for(int i=0; i<n; i++){
            boolean isPossible = true;
            for(int j=0; j<n; j++){
                if(j!=i){
                    if(!knows(j, i) || knows(i, j)){
                        isPossible = false;
                        break;
                    }
                        
                }
            }
            
            if(isPossible)
                return i;
        }
        
        return -1;
    }
}