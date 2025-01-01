class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int video_len_sec = transformToSecond(video_len);
        int pos_sec = transformToSecond(pos);
        int op_start_sec = transformToSecond(op_start);
        int op_end_sec = transformToSecond(op_end);
        
        for(int i = 0; i < commands.length; i++) {
            if(op_start_sec <= pos_sec && pos_sec < op_end_sec) {
                pos_sec = op_end_sec;
            }
            
            if(commands[i].equals("next")) {
                pos_sec += 10;
            } else {
                pos_sec -= 10;
            }
            
            if(op_start_sec <= pos_sec && pos_sec < op_end_sec) {
                pos_sec = op_end_sec;
            } else {
                if(pos_sec > video_len_sec) pos_sec = video_len_sec;
                if(pos_sec < 0) pos_sec = 0;
            }
        }
        
        return transformToTime(pos_sec);
    }
    
    public int transformToSecond(String time) {
        String[] timeSplit = time.split(":");
        return Integer.parseInt(timeSplit[0]) * 60 + Integer.parseInt(timeSplit[1]);
    }
    
    public String transformToTime(int time) {
        int minute = (time / 60);
        int second = (time % 60);
        
        String minuteString = String.valueOf(minute);
        String secondString = String.valueOf(second);
        
        if(minute < 10) minuteString = "0" + minute;
        if(second < 10) secondString = "0" + second;
        return minuteString + ":" + secondString;
    }
}