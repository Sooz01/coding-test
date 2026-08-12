class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        double a = (double)sum/numbers.length;
        return a;
    }
}