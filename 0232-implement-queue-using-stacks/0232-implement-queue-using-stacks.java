class MyQueue {
        List<Integer>s;
    public MyQueue() {
        s= new ArrayList<>();
    }
    
    public void push(int x) {
        s.add(x);
    }
    
    public int pop() {
       int param_2 = (int)s.get(0);
        s.remove(0);
        return param_2;
    }
    
    public int peek() {
        int param = (int)s.get(0);
        return param;
    }
    
    public boolean empty() {
        if(s.size()>0)
            return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */