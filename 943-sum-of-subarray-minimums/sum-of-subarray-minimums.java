class Solution {
    public int sumSubarrayMins(int[] arr) {
        int totalSum = 0;
        Stack<Integer> stack = new Stack<>();
        long moduloValue = (long) 1000000007;
        stack.push(-1);

        for (int i = 0; i < arr.length + 1; i++) {
            int currentElement = (i <= arr.length - 1) ? arr[i] : 0;

            while (stack.peek() != -1 && currentElement < arr[stack.peek()]) {
                int poppedIndex = stack.pop();
                int previousIndex = stack.peek();
                int leftSpan = poppedIndex - previousIndex;
                int rightSpan = i - poppedIndex;
                long addValue = (leftSpan * rightSpan * (long) arr[poppedIndex]) % moduloValue;
                totalSum += addValue;
                totalSum %= moduloValue;
            }

            stack.push(i);
        }
        return totalSum;
    }
}

