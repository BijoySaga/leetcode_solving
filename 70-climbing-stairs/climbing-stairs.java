class Solution {
    public int climbStairs(int steps) {
        int firstStep = 1;
        int secondStep = 1;
        int currentStep = 0;
        if (steps == 1) {
            return 1;
        }
        while (steps > 1) {
            currentStep = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = currentStep;
            steps--;
        }
        return currentStep;
    }
}//bijoysaga
