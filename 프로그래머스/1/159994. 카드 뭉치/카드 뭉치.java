class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int top1 = 0;
        int top2 = 0;
        for(int i = 0; i < goal.length; i++) {
            if (top1 < cards1.length && goal[i].equals(cards1[top1]))
            {
                top1++;
                continue;
            }
            if (top2 < cards2.length && goal[i].equals(cards2[top2]))
            {
                top2++;
                continue;
            }
            return "No";
        }
        return "Yes";
    }
}