import java.util.Arrays;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int maxCount = 0;
        int minCount = 0;
        for(int num: lottos) {
            if(Arrays.stream(win_nums).anyMatch(number -> number == num)) {
                maxCount++;
                minCount++;
            }
            if(num == 0) {
                maxCount++;
            }
        }
        
        int[] prize = new int[2];
        prize[0] = calculatePrize(maxCount);
        prize[1] = calculatePrize(minCount);
        
        return prize;
    }
    
    int calculatePrize(int num) {
        switch(num) {
            case 0:
                return 6;
            case 1:
                return 6;
            case 2:
                return 5;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 2;
            case 6:
                return 1;
            default:
                return 6;
        }
    }
}