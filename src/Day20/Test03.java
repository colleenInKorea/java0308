package Day20;

import java.util.ArrayList;
import java.util.Collections;

public class Test03 {
    public String solution(String s){
        String answer = "";
        ArrayList<Integer> arr = new ArrayList<>();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            arr.add(Integer.parseInt(str[i]));
        }

        answer = "" + Collections.min(arr) + " " + Collections.max(arr);
        return answer;
    }
}
