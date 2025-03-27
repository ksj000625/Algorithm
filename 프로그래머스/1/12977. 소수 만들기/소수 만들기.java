class Solution {
    public int solution(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    if(isPrime(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }
        
        return count;
    }
    
    private boolean isPrime(int number) {
        if(number < 2) {
			return false;
		}
		
		if(number == 2) {
			return true;
		}
		
        
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
        
        return true;
    }
}