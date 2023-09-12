class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                // Check if the previous and next plots are also empty
                boolean prevEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean nextEmpty = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (prevEmpty && nextEmpty) {
                    // Plant a flower and decrement n
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }

        return n <= 0;
    }
}