public class Dog extends Animal implements Speakable, Runable{
    public Dog(String nickName, int legs, String owner) {
        super(nickName, legs, owner);
    }

    @Override
    public String speak() {
        return "Waw";
    }
    @Override
    public Integer runSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return "Dog" + super.toString();
    }
}


