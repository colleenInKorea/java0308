package lastExam;

class Car{
    private int speed;

    Car(int speed){
        speed = this.speed;
    }

    void  upSpeed(int value){
        speed += value;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

public class lesson11 {
    public static void main(String[] args) {
        Car myCar = new Car(0);
        myCar.upSpeed(30);
    }
}
