public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable{
    public Duck(String nickName, int legs, String owner) {
        super(nickName, legs, owner);
    }
    @Override
    public int flySpeed() {
        return 40;
    }

    @Override
    public Integer runSpeed() {
        return 3;
    }

    @Override
    public String speak() {
        return "Krya";
    }
    @Override
    public int swimSpeed() {
        return 2;
    }
    @Override
    public String toString() {
        return "Duck" + super.toString();
    }
}
