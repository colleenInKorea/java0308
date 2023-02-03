package Day21;

public class Bus extends PublicTransport {
    Bus (int number, int amount, int speed,  int nowPassenger){
        this.setNumber(number);
        this.setAmount(amount);
        this.setSpeed(speed);
        this.setMaxPassenger(30);
        this.setNowPassenger(nowPassenger);
        this.setState("운행중");
        this.setFee(1000);
    }

    @Override
     public String startDriving(){
        String answer = this.getState();
        return  answer + "입니다.";
    }

//    @Override
//    public String changeSp(int changeSpeed) {
//        String answer = "";
//        this.setSpeed(this.getSpeed() + (changeSpeed));
//        if(this.getAmount() < 10){
//            System.out.println( "주유량 : " + this.getAmount());
//            System.out.println("주유량을 확인해주세요");
//            answer += "속도가 " + this.getSpeed() +"으로 변경 되었습니다.";
//        }else {
//            answer += "속도가 " + this.getSpeed() +"으로 변경 되었습니다." ;
//        }
//        return answer;
//    }

    @Override
    public String insertPassenger(int num) {
        String answer = "";

        if(this.getState().equals("운행중")){
            this.setNowPassenger(this.getNowPassenger() + num);
            this.setMaxPassenger(30 - this.getNowPassenger());
            if(this.getNowPassenger() > 30){
                answer += "최대 승객수를 넘었습니다. 다음 버스를 이용해주세요";
                this.setNowPassenger(this.getNowPassenger()- num);
                this.setMaxPassenger(30 - this.getNowPassenger());
            }else {
                answer += "승객이 " + num+"명만큼 늘었습니다. 잔여 이용객 수는 " +this.getMaxPassenger() + "입니다. 요금은 " + (num * this.getFee()) + "원 입니다.";
            }
        }else {
            answer += "운행중인 버스가 아니므로 다른 버스를 이용해 주세요";
        }
        return answer;
    }

    @Override
    public void changeState() {
        if(this.getState().equals("차고지행")){
            if(this.getAmount() < 10){
                this.setState("차고지행");
                this.setNowPassenger(0);
                this.setMaxPassenger(30);
                this.setFee(0);
            }else {
                this.setState("운행중");
            }
        }else {
            this.setState("차고지행");
            this.setNowPassenger(0);
            this.setMaxPassenger(30);
            this.setFee(0);
        }
    }

    @Override
    public  void changeAmount(int fuel){
        this.setAmount(this.getAmount()+(fuel));
        if (fuel < 0){
            if (this.getAmount() < 10){
                this.setState("차고지행");
                System.out.println("주유량 : " + this.getAmount());
                System.out.println("상태 : " + this.getState());
                System.out.println("주유가 필요합니다");
            } else {
                System.out.println("주유량 : " + this.getAmount());
            }
        }else {
            System.out.println("주유량 : " + this.getAmount());
            System.out.println("상태 : " + this.getState());
        }
    }
}
