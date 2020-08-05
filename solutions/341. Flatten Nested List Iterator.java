/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> flat = new ArrayList<>();
    Iterator<Integer> iter;
​
    public NestedIterator(List<NestedInteger> nestedList) {
        flatten(nestedList);
        iter = flat.iterator();
    }
    
    private void flatten(List<NestedInteger> list) {
        for(NestedInteger nI: list) {
            if(nI.isInteger()) {
                flat.add(nI.getInteger());
            } else {
                flatten(nI.getList());    
            }   
        }
    }
​
    @Override
    public Integer next() {
        return iter.next();
    }
​
    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }
}
​
/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
