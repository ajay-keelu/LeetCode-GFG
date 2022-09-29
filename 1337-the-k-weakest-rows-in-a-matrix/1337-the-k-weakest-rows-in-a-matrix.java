class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int arr1[] = new int[mat.length];
        int arr2[] = new int[mat.length];
        int arr[] = new int[k];
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]==1)
                    c++;
                else
                    break;
            }
            arr2[i] = i;
            arr1[i] = c;
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat.length-1-i;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1]= temp;
                     temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1]= temp;
                }
            }
        }
        for(int i=0;i<k;i++)
        {
            arr[i] = arr2[i];
        }
        return arr;
    }
}