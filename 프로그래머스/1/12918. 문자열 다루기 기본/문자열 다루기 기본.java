class Solution {
    public boolean solution(String s) {
        if(s.length() != 4 && s.length() != 6) return false;
        
        return isNumberic(s);
    }
    
    public boolean isNumberic(String str) {
    	for(char c : str.toCharArray()) {
    		if(!Character.isDigit(c)) {
    			return false;
    		}
    	}
    	return true;
    }
}