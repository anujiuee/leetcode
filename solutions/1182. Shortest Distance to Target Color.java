class Solution {
    public List<Integer> shortestDistanceColor(int[] colors, int[][] queries) {
       
        
         
        int n = colors.length;
        
        int arr[][] = new int [colors.length][3];
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        
       for (int i=0;i<n;i++){
           
           if(colors[i]==1) a=-1;
           else if (colors[i]==2) b=-1;
           else c=-1;
           
           if(b!=Integer.MAX_VALUE) b++;
           if(a!=Integer.MAX_VALUE) a++;
           if(c!=Integer.MAX_VALUE) c++;
           
           arr[i][0]=a;
           arr[i][1]=b;
           arr[i][2]=c;
           
       }
        
         a = Integer.MAX_VALUE;
         b = Integer.MAX_VALUE;
         c = Integer.MAX_VALUE;
        
        for (int i=n-1;i>=0;i--){
           
          
           if(colors[i]==1) a=-1;
           else if (colors[i]==2) b=-1;
           else c=-1;
           
           if(b!=Integer.MAX_VALUE) b++;
           if(a!=Integer.MAX_VALUE) a++;
           if(c!=Integer.MAX_VALUE) c++;
           
            
           arr[i][0]=Math.min(arr[i][0],a);
           arr[i][1]=Math.min(arr[i][1],b);
           arr[i][2]=Math.min(arr[i][2],c);
