class Solution {
    public int solution(String s) {
        String number = "";
        
        String temp = "";
        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                number += s.charAt(i);
                continue;
            }
            temp += s.charAt(i);
            switch(temp) {
                case "one":
                    number += 1;
                    temp = "";
                    break;
                case "two":
                    number += 2;
                    temp = "";
                    break;
                case "three":
                    number += 3;
                    temp = "";
                    break;
                case "four":
                    number += 4;
                    temp = "";
                    break;
                case "five":
                    number += 5;
                    temp = "";
                    break;
                case "six":
                    number += 6;
                    temp = "";
                    break;
                case "seven":
                    number += 7;
                    temp = "";
                    break;
                case "eight":
                    number += 8;
                    temp = "";
                    break;
                case "nine":
                    number += 9;
                    temp = "";
                    break;
                case "zero":
                    number += 0;
                    temp = "";
                    break;
                default:
                    break;
            }
        }
        
        return Integer.parseInt(number);
    }
}