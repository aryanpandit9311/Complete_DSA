class Solution {
    public int[] nextGreaterElements(int[] arr) {

        int newarr[] = new int[arr.length];
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int j = 2 * arr.length - 1; j >= 0; j--) {

            int i = j % arr.length;

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (j < arr.length) {

                if (stack.isEmpty()) {
                    newarr[i] = -1;
                } else {
                    newarr[i] = stack.peek();
                }
            }

            stack.push(arr[i]);
        }

        return newarr;
    }
}