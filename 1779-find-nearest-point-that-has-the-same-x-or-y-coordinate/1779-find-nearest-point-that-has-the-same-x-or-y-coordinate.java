class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        Map<Integer,Integer> hm = new HashMap<>();
        int index = -1,min = Integer.MAX_VALUE;
        for(int i=0;i<points.length;i++)
        {
            if(points[i][0]==x || points[i][1]==y)
            {
                int md = Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                if(min>md)
                    min = md;
                hm.put(i,md);
            }
        }
        for(Map.Entry e:hm.entrySet())
        {
            if((int)e.getValue() == min)
            {
                index = (int)e.getKey();
                break;
            }
        }
        return index;
    }
}