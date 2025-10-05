class Solution {
    static char[] vowels = {'A','E','I','O','U'};
    static int count;
    static int answer;

    public int solution(String word) {
        count = 0;
        answer = 0;
        dfs("", word);
        return answer;
    }

    static void dfs(String cur, String target) {
        if (cur.equals(target)) {
            answer = count;
            return;
        }
        if (cur.length() == 5) {
            return;
        }
        for (char v : vowels) {
            if (answer != 0) return;
            count++;
            dfs(cur + v, target);
        }
    }
}
