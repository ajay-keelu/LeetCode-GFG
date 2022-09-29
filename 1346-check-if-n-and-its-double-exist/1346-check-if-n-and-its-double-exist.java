class Solution {
    public boolean checkIfExist(int[] arr) {
        //Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j && arr[i] == arr[j]*2)
                    return true;
            }
        }
        return false;
    }
}