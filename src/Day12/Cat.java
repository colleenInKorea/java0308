package Day12;

public class Cat extends Animal{
    public Cat( String name, int age, String type){
        this.setName(name);
        this.setAge(age);
        this.setType(type);

    }

    @Override
    public  void  move(){
        System.out.println( this.getName() + " 가 움직입니다.");
    }

    public void sayAge(){
        System.out.println(this.getName() + "는 " + this.getAge() + "개월입니다.");
    }
}
