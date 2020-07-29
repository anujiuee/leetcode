class Solution {
     public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a,b)->a[0]-b[0]); // sort increasing by start time
        Arrays.sort(slots2, (a,b)->a[0]-b[0]); // sort increasing by start time
​
        int i = 0, j = 0;
        int n1 = slots1.length, n2 = slots2.length;
        while (i < n1 && j < n2) {
            // Find intersect between slots1[i] and slots2[j]
            int intersectStart = Math.max(slots1[i][0], slots2[j][0]);
            int intersectEnd = Math.min(slots1[i][1], slots2[j][1]);
​
            if (intersectStart + duration <= intersectEnd) // Found the result
                return Arrays.asList(intersectStart, intersectStart + duration);
            else if (slots1[i][1] < slots2[j][1])
                i++;
            else
                j++;
        }
        return new ArrayList<>();
    }
}
