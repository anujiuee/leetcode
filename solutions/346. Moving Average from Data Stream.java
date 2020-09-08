class MovingAverage {
​
    /** Initialize your data structure here. */
    double ans = 0;
    int size = 0;
    int len = 0;
    Queue<Integer> q = new LinkedList();
    
    public MovingAverage(int size) {
        this.size= size;
    }
    
    public double next(int val) {
        
        if(len<size){
            q.add(val);
            ans+=val;
             len++;   
             return ans/len;   
        }
        
        int c = q.peek();
        q.poll();
        q.add(val);
        
        return (ans-c+val)/size;
        
        
    }
}
​
/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
