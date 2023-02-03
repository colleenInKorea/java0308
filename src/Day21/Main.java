package Day21;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        Bus bus1 = new Bus( number, 100, 30, 2);

        int number1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
        if(number1 != number){
            Bus bus2 = new Bus(number1, 60, 40, 5);
        }else {
            number1 = (int) (Math.random() * (9999 - 1000 + 1)) + 1000;
            System.out.println("새로운 차 번호를 생성했습니다. : " + number1);
        }

        System.out.println( bus1.startDriving());
        System.out.println(bus1.insertPassenger(2));

        bus1.changeAmount(-50);
        bus1.changeState();
        bus1.changeAmount(10);

        bus1.setState("운행중");
        System.out.println(bus1.insertPassenger(45));
        System.out.println(bus1.insertPassenger(5));
        bus1.changeAmount(-55);

    }
}
