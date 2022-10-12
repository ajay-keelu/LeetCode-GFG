class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int i,j,k,sum;
        sum=0;
        i=0;
        while(i!=arr.length){
            j=0;
            while(j!=arr.length){
                if((j-i)%2==0){
                    for(k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}