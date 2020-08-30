/**
 * // This is ArrayReader's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface ArrayReader {
 *     // Compares the sum of arr[l..r] with the sum of arr[x..y] 
 *     // return 1 if sum(arr[l..r]) > sum(arr[x..y])
 *     // return 0 if sum(arr[l..r]) == sum(arr[x..y])
 *     // return -1 if sum(arr[l..r]) < sum(arr[x..y])
 *     public int compareSub(int l, int r, int x, int y) {}
 *
 *     // Returns the length of the array
 *     public int length() {}
 * }
 */
​
class Solution {
    public int getIndex(ArrayReader reader) {
        
        int n = reader.length();
        
        return getIndex(0,n-1,reader);
    }
    
    public int getIndex(int start ,int end, ArrayReader reader) {
        
        if(start==end){
            return end;
        }
        
        int mid = start+(end-start)/2;
        
        if((end-start)%2==0){
            if(reader.compareSub(start,mid,mid,end)>0){
           return getIndex(start,mid,reader);
         }
        
        
             return getIndex(mid,end,reader);
        }
        
      
        if(reader.compareSub(start,mid,mid+1,end)>0){
           return getIndex(start,mid,reader);
        }
        
        
             return getIndex(mid+1,end,reader);
        
        
    }
}
