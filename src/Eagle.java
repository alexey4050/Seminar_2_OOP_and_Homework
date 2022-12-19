public class Eagle extends Animal implements Speakable, Runable, Flyable{
    public Eagle(String nickName, int legs, String owner) {
        super(nickName, legs, owner);
    }

    @Override
    public int flySpeed() {
        return 60;
    }

    @Override
    public Integer runSpeed() {
        return 6;
    }

    @Override
    public String speak() {
        return "Iay";
    }
    @Override
    public String toString() {
        return "Eagle" + super.toString();
    }
}

