class Solution {
    public int maxBoxesInWarehouse(int[] boxes, int[] warehouse) {
        
        
        int n = warehouse.length;
        
        for (int i=1;i<n;i++){
            warehouse[i] = Math.min(warehouse[i-1],warehouse[i]);
        }
        
        Arrays.sort(boxes);
        
        int k = 0;
                
         for (int i = n - 1; i >= 0; i--) {
            if (k < boxes.length && boxes[k] <= warehouse[i]) {
                k++;
            }
        }
​
        
        return k;
        
    }
}
