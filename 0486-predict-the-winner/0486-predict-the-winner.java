class Solution {
        private int n;
    private int[][] t;

    public int solve(int[] nums, int l, int r) {
        if (l > r)
            return 0;

        if (l == r)
            return nums[l];

        if (t[l][r] != -1)
            return t[l][r];

        int takeLeft = nums[l] + Math.min(solve(nums, l + 2, r), solve(nums, l + 1, r - 1));
        int takeRight = nums[r] + Math.min(solve(nums, l, r - 2), solve(nums, l + 1, r - 1));

        return t[l][r] = Math.max(takeLeft, takeRight);
    }
    public boolean predictTheWinner(int[] nums) {
        n = nums.length;
        t = new int[n][n];

        for (int[] row : t) {
            Arrays.fill(row, -1);
        }

        int total = Arrays.stream(nums).sum();
        int player1 = solve(nums, 0, n - 1);
        int player2 = total - player1;

        return player1 >= player2;
    }
}