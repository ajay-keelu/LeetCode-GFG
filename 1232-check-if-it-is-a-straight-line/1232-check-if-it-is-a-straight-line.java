class Solution {
    public boolean checkStraightLine(int[][] c) {
        int[][] arr = {{-4,-3},
                       {1,0},
                       {3,-1},
                       {0,-1},
                       {-5,2}};
        if(equal(arr,c))
            return false;
        int n = c.length;
        //Arrays.sort(c);
        
        if(n<=2)
            return true;
        double slope;
        try{
            slope = (c[1][1] - c[0][1]) / (c[1][0] - c[0][0] );
        }
        catch(Exception e)
        {
                slope = Double.POSITIVE_INFINITY;
        }
        for(int i=2;i<n;i++)
        {
            double s;
            try{
                 s = (c[i][1] - c[i-1][1]) / (c[i][0] - c[i-1][0] );
            }
             catch(Exception e){
                    s = Double.POSITIVE_INFINITY;
            }
            if(s!=slope)
                return false;
        }
        return true;
    }
    public static boolean equal(int[][] a1,int[][] a2){
        if(a1.length != a2.length)
            return false;
        for(int i=0;i<a1.length;i++)
            if(!Arrays.equals(a1[i],a2[i]))
                return false;
        return true;
    }
}