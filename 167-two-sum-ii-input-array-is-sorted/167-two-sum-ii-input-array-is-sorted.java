class Solution {
    public int[] twoSum(int[] num, int t) {
        int arr[] = {1,2};
        if(num.length==2)
            return arr;
        int st=0,end = t;
        while(st<=end &&st+end==t)
        {
            int i1,i2;
            i1 = Arrays.binarySearch(num,st);
            i2 = Arrays.binarySearch(num,end);
            if(i1>=0 &&i2>=0){
                if(i1==i2&&num[i1]==num[i2+1])
                    i2++;
                else if(i1==i2 &&num[i1]!=num[i2+1])
                    i1--;
                
                arr[0]=i1+1;
                arr[1]=i2+1;
            return arr;
            }
            else{
                st++;end--;
            }
            
        }
        return arr;
    }
}