class Solution {

	int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

	public int closedIsland(int[][] grid) {

		int cnt = 0;
		int m = grid.length, n = grid[0].length;
		int[][] vis = new int[m][n];

		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if(vis[i][j] == 0 && grid[i][j] == 0) {
					if(dfs(i, j, m, n, grid, vis)) cnt++;
				}
			}
		}
		return cnt;
	}

	public boolean dfs(int i, int j, int m, int n, int[][] arr, int[][] vis) {

		if(i < 0 || j < 0 || i >= m || j >= n) return false;
		if(vis[i][j] == 1 || arr[i][j] == 1) return true;

		vis[i][j] = 1;
		boolean ans = true;
		
		for(int[] dir : dirs) ans &= dfs(i + dir[0], j + dir[1], m, n, arr, vis);
		return ans;
	}
}
