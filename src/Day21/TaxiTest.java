package Day21;

public class TaxiTest {
    public static void main(String[] args) {
        int number = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
       Taxi taxi = new Taxi( number, 100);

        int number1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        if(number1 != number){
            Taxi taxi1 = new Taxi(number1, 60);
            System.out.println("서로다른 두 차가 생성 되었습니다.");
        }else {
            number1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
            System.out.println("새로운 차 번호를 생성했습니다. : " + number1);
        }

        System.out.println(taxi.startDriving());
        System.out.println("주유량 : " + taxi.getAmount());
        System.out.println(taxi.insertPassenger(2, "서울역", 2));
        System.out.println("상태 : " + taxi.getState());
        taxi.changeAmount(-80);
        taxi.payment();
        System.out.println(taxi.insertPassenger(5, "삼각지", 5));
        System.out.println(taxi.insertPassenger(3, "구로디지털단지", 12));
        taxi.changeAmount(-20);
        taxi.payment();

    }
}
