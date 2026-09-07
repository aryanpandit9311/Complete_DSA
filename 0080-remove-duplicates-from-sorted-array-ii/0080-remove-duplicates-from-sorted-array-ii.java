class Solution {
    public int removeDuplicates(int[] arr) {
        int c = 1;
        int w = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                c++;
            } else {
                c = 1;
            }

            if (c <= 2) {
                arr[w] = arr[i];
                w++;
            }
        }

        return w;
    }
}