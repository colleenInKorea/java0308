package Day12;

public class Dog extends Animal{
    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public  void  move(){
        System.out.println( this.name + " 가 움직입니다.");
    }

    public void sayAge(){
        System.out.println(this.name + "는 " + this.age + "개월입니다.");
    }
}
