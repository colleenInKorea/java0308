package Day14_4;

import java.util.Arrays;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for( i = 0; i < completion.length; i++){
            if(!participant[i].equals(completion[i])){
                break;
            }
        }
        answer = participant[i];
        return answer;
    }
}
