class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a,b;
        int i = 1;
        while(true)
        {
            a = i;
            b = n-i;
            if(!Integer.toString(a).contains("0") && !Integer.toString(b).contains("0"))
                break;
            i++;
        }
        int arr[] = {a,b};
        return arr;
    }
}