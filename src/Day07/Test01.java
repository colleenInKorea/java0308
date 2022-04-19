package Day07;

public class Test01 {
    static int getNumber(){
        return (int)(Math.random() * 45 +1);
    }

    public static void main(String[] args) {
        int[]lotto ={0, 0, 0, 0, 0, 0};
        int num = 0;
        char dupl = 'N';

        System.out.println(" ** 로또 추첨을 하겠습니다. **");

        for(int i = 0; i < 6;){
            num = getNumber();

            for(int k = 0; k < 6; k++){
                if(lotto[k] == num){
                    dupl = 'Y';
                }
            }
            if(dupl == 'N'){
                lotto[i++] = num;
            }else{
                dupl = 'N';
            }
        }

        System.out.println("추첨된 로또 번호를 출력합니다. ");
        for(int i = 0; i < 6; i++){
            System.out.print(lotto[i]+ " ");
        }
    }
}
