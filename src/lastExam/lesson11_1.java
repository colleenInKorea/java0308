package lastExam;

class Book { //Book클래스
    Book() {
        System.out.println("Book 클래스 생성자 ~~ (파라미터 없음)");
    }
    Book(String str) {
        this();
        System.out.println("Book 클래스 생성자 --> "+ str);
    }
}
class ComputerBook extends Book { //Computer클래스
    ComputerBook(String str) {
        super(str);
        System.out.println("ComputerBook 클래스 생성자 ~~");
    }
}

public class lesson11_1 {
        public static void main(String[] args) {
            ComputerBook sedan1 = new ComputerBook("굿 자바");
        }

}
