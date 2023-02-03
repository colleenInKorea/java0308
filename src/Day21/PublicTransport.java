package Day21;

public abstract class PublicTransport {
    private int number;
    private int amount = 100;// 주유량
    private int speed = 0;//속도
    private int maxPassenger;//최대 승객수
    private String state;//상태
    private int nowPassenger;//현재승객수
    private int fee ;//요금


    //getter, setter 만들기
    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        this.nowPassenger = nowPassenger;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    //공통요소 기능 만들기
    //운행시작
    public String startDriving() {
        String answer = "";
        return answer;
    }

    //속도 변경
    public String changeSp(int changeSpeed) {
        String answer = "";
        return answer;
    }

    //상태 변경
    public void changeState() {

    }

    //승객 탑승
    public String insertPassenger(int num) {
        String answer = "";
//        int sum =
        return answer;
    }

    //주유량 변화
    public  void changeAmount(int fuel){

    }


}
