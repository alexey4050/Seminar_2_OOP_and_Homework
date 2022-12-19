public class Cat extends Animal implements Speakable, Runable{
    public Cat(String nickName, int legs, String owner) {
        super(nickName, legs, owner);
    }

    @Override
    public String speak() {
        return "Myau";
    }
    @Override
    public Integer runSpeed() {
        return 30;
    }

    @Override
    public String toString() {
        return "Cat" + super.toString();
    }
}
