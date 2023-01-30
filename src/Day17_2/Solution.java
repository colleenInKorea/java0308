package Day17_2;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        int tmp = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i< numbers.length -1; i ++ ){
            for(int j = i + 1; j < numbers.length; j++){
                tmp = numbers[i] + numbers[j];
                if(!arr.contains(tmp)){
                    arr.add(tmp);
                }
            }
        }
        Collections.sort(arr);
        int[] answer = new int [arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}