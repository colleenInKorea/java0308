package Day21;

public class Taxi extends PublicTransport{
    private String target;
    private int targetDistance;
    private int disPerFee;

    public int getTotalFee() {
        return totalFee;
    }

    private int totalFee;

    Taxi(int number, int amount){
        this.setNumber(number);
        this.setAmount(amount);
       this.setMaxPassenger(4);
       this.setNowPassenger(0);
       this.setFee(3000);
       this.totalFee = 0;
    }

    @Override
    public String startDriving(){
        String answer = "";
        if(this.getAmount() < 10){
            this.setState("운행불가");
            System.out.println(this.getState() + " 주유를 해주세요.");
        }else {
            this.setState("일반");
           answer = "상태 :" + this.getState();
        }
        return answer;
    }


    public String insertPassenger(int num, String target, int targetDistance) {
        String answer = "";
        if(this.getState().equals("일반")){
            this.setNowPassenger(this.getNowPassenger() + num);
            this.setMaxPassenger(4 - this.getNowPassenger());
            if(this.getNowPassenger() > 4){
                answer += "최대 승객수를 넘었습니다. \n 다음 택시를 이용해주세요";
                this.setNowPassenger(this.getNowPassenger()- num);
                this.setMaxPassenger(30 - this.getNowPassenger());
            }else {
                if(targetDistance > 1){
                    int extraDis = targetDistance - 1;
                    this.target = target;
                    this.targetDistance = targetDistance;
                    this.setState("운행중");
                    this.totalFee += (this.getFee() + (extraDis * 1000));
                    answer += "승객이 " + num+"명만큼 늘었습니다. \n 잔여 이용객 수는 " +this.getMaxPassenger() + "입니다. \n 목적지는 " + target +"입니다. \n 요금은 " + (this.getFee() + (extraDis * 1000))+ "원 입니다.";

                }else {
                    this.target = target;
                    this.targetDistance = targetDistance;
                    this.setState("운행중");
                    this.totalFee += this.getFee();
                    answer += "기본요금 입니다. \n승객이 " + num+"명만큼 늘었습니다. \n 잔여 이용객 수는 " +this.getMaxPassenger() + "입니다. \n 목적지는 " + target +"입니다. \n 요금은 " + this.getFee() + "원 입니다.";
                }

            }
        }else {
            answer += "운행중인 택시가 아니므로 다른 택시를 이용해 주세요";
        }
        return answer;
    }

    @Override
    public  void changeAmount(int fuel){
        this.setAmount(this.getAmount()+(fuel));
        if (fuel < 0){
            if (this.getAmount() < 10){
                this.setState("운행불가");
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

    public void payment(){
       if(this.getAmount() < 10){
           this.setState("운행불가");
           this.setNowPassenger(0);
           this.setMaxPassenger(4);
           System.out.println("상태 : " + this.getState());
           System.out.println("누적요금 : " + this.totalFee);
           System.out.println("주유가 필요합니다");
       }else {
           this.setState("일반");
           this.setNowPassenger(0);
           this.setMaxPassenger(4);
           System.out.println("상태 : " + this.getState());
           System.out.println("누적요금 : " + this.totalFee);
       }
    }
}
