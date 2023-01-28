package Day15_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        int[] clone = arr.clone();
        Arrays.sort(clone);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i< clone.length; i++){
            if (arr[i] != clone[0]){
                list.add(arr[i]);
            }
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }


        return answer;
    }
}
