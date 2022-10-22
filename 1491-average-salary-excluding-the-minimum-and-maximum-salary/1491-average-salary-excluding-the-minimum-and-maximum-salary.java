class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int n = salary.length;
        Arrays.sort(salary);
        for(int i=1;i<n-1;i++)
            sum += salary[i];
        double avg = (double)sum/(n-2);
        return avg;
    }
}