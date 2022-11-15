class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        List<Integer>li = new ArrayList<>();
        int dir = 0;
        int top,bot,left,rig;
        top = 0;
        left = 0;
        bot = a.length-1;
        rig = a[0].length-1;
        while(left<=rig &&top<=bot)
	    {
	        if(dir == 0 )
	        {
	            for(int i=left;i<=rig;i++)
	                li.add(a[top][i]);
	            dir++;
	            top++;
	        }
	        else if(dir == 1 )
	        {
	            for(int i=top;i<=bot;i++)
	            li.add(a[i][rig]);
	            dir++;
	            rig--;
	        }
	        else if(dir == 2 )
	        {
	            for(int i=rig;i>=left;i--)
	            li.add(a[bot][i]);
	            dir++;
	            bot--;
	        }
	        else
	        {
	            for(int i=bot;i>=top;i--)
	            li.add(a[i][left]);
	            dir++;
	            left++;
	        }
	        dir = dir%4;
	    }
        return li;
    }
}