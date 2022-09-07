package lastExam;

class Whale implements Animal, Fish {
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
    public void swim() {
        System.out.println("고래는 물속에서 삽니다.");
    }
}
interface Animal {
    void bear();
}
interface Fish {
    void swim();
}

public class lesson11_2 {
    public static void main(String[] args) {
        Whale tank1 = new Whale();
        tank1.bear();
        tank1.swim();
    }
}
