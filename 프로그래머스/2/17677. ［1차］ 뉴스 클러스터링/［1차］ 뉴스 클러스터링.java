import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        
        for(int i = 0; i < str1.length() - 1; i++) {
            String part = str1.substring(i, i + 2).toLowerCase();
            if(Character.isLetter(part.charAt(0)) && Character.isLetter(part.charAt(1))) {
                list1.add(part);
            }
        }
        for(int i = 0; i < str2.length() - 1; i++) {
            String part = str2.substring(i, i + 2).toLowerCase();
            if(Character.isLetter(part.charAt(0)) && Character.isLetter(part.charAt(1))) {
                list2.add(part);
            }
        }
        
        List<String> tempList2 = new ArrayList<>(list2);
        int intersection = 0;
        
        for(String s : list1) {
            if(tempList2.contains(s)) {
                intersection++;
                tempList2.remove(s);
            }
        }
        
        int union = list1.size() + list2.size() - intersection;
        
        if(union == 0) return 65536;
        
        double jaccard = (double) intersection / union;
        return (int) (jaccard * 65536);
    }
}
