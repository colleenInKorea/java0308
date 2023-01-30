package Day17_6;

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        // 문자열을 문자 하나하나 띄어서 만든다.
        char[] arr = s.toCharArray();
        // 정렬을 한다.
        Arrays.sort(arr);
        //StringBuilder를 사용해서 뒤집어서 출력한다.
        return new StringBuilder(new String(arr)).reverse().toString();
    }
}
