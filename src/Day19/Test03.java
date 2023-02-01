package Day19;

public class Test03 {
    public int solution(int n) {// 프로그래머스 소수찾기
        int answer = 0;
        // 해당 숫자까지 소수가 몇개 있는지 하나하나 넣는 과정
        for(int i = 2; i <= n; i++){
            boolean flag = true;
            for(int j = 2; j <= Math.sqrt(i); j++){// 소수를 판별하는 내용
                if(i % j == 0){
                   flag = false;
                   break;
                }
            }
            if(flag == true){// 소수이면 answer에 추가 하기
                answer++;
            }
        }

        return answer;
    }
}
