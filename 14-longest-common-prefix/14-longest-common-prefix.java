class Solution {
    public String longestCommonPrefix(String[] arr) {
        int min = arr[0].length();
        int n = arr.length;
        String mst = arr[0];
        for(String e:arr)
        if(e.length()<min){
            min = e.length();
            mst = e;
        }
        int ind = 0;
        String temp="";
        for(int i=0;i<min;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(mst.charAt(i) != arr[j].charAt(i))
                c++;
            }
            if(c!=0)
            break;
            temp+=mst.charAt(i);
        }
        if(temp.length()==0)
        return "";
        return temp;
    }
}