package MainTest;

public class Test02 {
    public int solution(String s) {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'O'){
                count++;
            }else {
                count = 0;
            }
            sum+= count;
        }
        return sum;
    }

    public static void main(String[] args) {
        Test02 method = new Test02();
        String s = "OXOOOXXXOXOOXOOOOOXO";
        System.out.println(method.solution(s));
    }
}
