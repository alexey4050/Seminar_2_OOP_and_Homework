public class Fish extends Animal implements Swimable {
    public Fish(String nickName, int legs, String owner) {
        super(nickName, legs, owner);
    }

    @Override
    public int swimSpeed() {
        return 20;
    }
    @Override
    public String toString() {
        return "Fish" + super.toString();
    }
}
