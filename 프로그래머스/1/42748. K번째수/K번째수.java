import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0; i < commands.length; i++) {
            // 자르기
            int[] arr = getSlice(array, commands[i][0] - 1, commands[i][1] - 1);
            // 정렬
            Arrays.sort(arr);
            // 값 구하기
            answer[i] = arr[commands[i][2] - 1];
        }
        
        return answer;
    }
    
    public int[] getSlice(int[] arr, int stIndx, int enIndx) {
        int[] sclicedArr = new int[enIndx - stIndx + 1];

        for (int i = 0; i < sclicedArr.length; i++) {
          sclicedArr[i] = arr[stIndx + i];
        }

        return sclicedArr;
    }
}