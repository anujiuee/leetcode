        ATTENTION !!! have to consider 1) 2.1) and 2.2) three candidates together,
        because even when arr[i] == arr[j] they are not necessarily removed in the same move,
        they can also be removed in left part and right part, respectively.
        
        return dp[0][n-1].
        */
        
        int n = arr.length;
        int[][] dp = new int[n][n];
        // for (int[] d : dp) Arrays.fill(d, n);
        
        // iterate from bottom right up.
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (i == j) dp[i][j] = 1;
                else if (i+1 == j) {
                    dp[i][j] = arr[i] == arr[j] ? 1 : 2; 
                } else {
                    int cand1 = n, cand2 = n, cand3 = n;
                    if (arr[i] == arr[j]) {
                        cand1 = dp[i+1][j-1];
                    }
                   // cand2 = Math.min(dp[i+1][j], dp[i][j-1]) + 1;
                    for (int k = i; k < j; k++) {
                        cand3 = Math.min(cand3, dp[i][k] + dp[k+1][j]);
                    }
                    dp[i][j] = Math.min(cand1,cand3);
                }
            }
        }
        return dp[0][n-1];
    }
}
