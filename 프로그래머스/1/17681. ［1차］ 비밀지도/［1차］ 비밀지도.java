class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];
            
            String binaryStr = Integer.toBinaryString(combined);
            if (binaryStr.length() < n) {
                binaryStr = String.format("%" + n + "s", binaryStr).replace(' ', '0');
            }
            
            StringBuilder line = new StringBuilder();
            for (char c : binaryStr.toCharArray()) {
                if (c == '1') {
                    line.append('#');
                } else {
                    line.append(' ');
                }
            }
            
            answer[i] = line.toString();
        }
        
        return answer;
    }
}
