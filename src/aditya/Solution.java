package aditya;

class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length + 2;
        int[] A = new int[n];
        A[0] = A[n - 1] = 1;
        for (int i = 0; i < nums.length; i++)
            A[i + 1] = nums[i];


        return getCoin(A, 0, n - 1);
    }
    private int getCoin (int[] A, int l, int r){
        int max_coin = 0;
        for (int i = l + 1; i < r; i++) {
            int score = A[l] * A[i] * A[r];
            max_coin = Math.max(max_coin, score + getCoin(A, l, i) + getCoin(A, i, r));
        }
        return max_coin;
    }
}
