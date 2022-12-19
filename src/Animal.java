public abstract class Animal {
    private String nickName;
    private int legs;
    private  String owner;
    public String getNickName() {
        return nickName;
    }

    public int getLegs() {
        return legs;
    }

    public String getOwner() {
        return owner;
    }

    public Animal(String nickName, int legs, String owner) {
        this.nickName = nickName;
        this.legs = legs;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", legs=" + legs +
                ", owner='" + owner + '\'' +
                '}';
    }

}


