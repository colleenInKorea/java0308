package Day17_5;

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            // 해당 인덱스의 문자와 스트링의 단어를 같이 저장한다.
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        //그 인덱스 문자를 기준으로 정렬을 한다.
        Collections.sort(arr);
        answer = new String[arr.size()];
        // 다시 배열에 저장한다.
        // 저장할때, 맨 앞에 있는 문자를 제외하고 저장한다.
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
