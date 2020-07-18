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

/*
public class Solution extends Relation {
    
    private int numberOfPeople;
    
    public int findCelebrity(int n) {
        numberOfPeople = n;
        int celebrityCandidate = 0;
        for (int i = 0; i < n; i++) {
            if (knows(celebrityCandidate, i)) {
                celebrityCandidate = i;
            }
        }
        if (isCelebrity(celebrityCandidate)) {
            return celebrityCandidate;
        }
        return -1;
    }
    
    private boolean isCelebrity(int i) {
        for (int j = 0; j < numberOfPeople; j++) {
            if (i == j) continue; // Don't ask if they know themselves.
            if (knows(i, j) || !knows(j, i)) {
                return false;
            }
        }
        return true;
    }
}
*/
