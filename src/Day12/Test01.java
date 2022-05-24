package Day12;

public class Test01 {
    public static void main(String[] args) {
         Cat nabi = new Cat("나비", 12, "고양이");
         Dog tom = new Dog("톰", 8, "강아지");

         Animal[] ourPet = new Animal[2];
         ourPet[0] =nabi;
         ourPet[1] = tom;

         nabi.move();
         tom.move();
         nabi.sayAge();
         tom.sayAge();
        System.out.println("우리집 애완동울의 수는 " + ourPet.length + "입니다.");

    }
}
