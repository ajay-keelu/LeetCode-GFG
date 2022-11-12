class MedianFinder {
    List<Integer>li;
    public MedianFinder() {
        li = new ArrayList<>();
    }
    
    public void addNum(int num) {
        int i;
        for( i = 0 ; i < li.size();i++)
        {
            if((int)li.get(i) > num)
                break;
        }
        li.add(i,num);
    }
    
    public double findMedian() {
        double d;
        int n = li.size();
        //Collections.sort(li);
        if(n%2 == 0)
            d = (double)(li.get(n/2)+li.get(n/2 - 1))/2;
        else
            d = (double)(li.get(n/2));
        return d;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */