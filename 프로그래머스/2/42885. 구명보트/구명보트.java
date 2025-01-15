import java.util.Arrays;

class Solution {
	public int solution(int[] people, int limit) {
		int peopleNum = people.length;
		int answer = 0;
		Arrays.sort(people);
		
		for (int i = 0; i < peopleNum; i++) {
			while (i < peopleNum - 1 && people[i] + people[--peopleNum] > limit) {
				answer++;
			}
			answer++;
		}
        
		return answer;
	}
}