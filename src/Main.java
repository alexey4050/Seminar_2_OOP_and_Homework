public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Barsik", 4, "Alexey"))
                .addAnimal(new Dog("Sharik", 4, "Andrey"))
                .addAnimal(new Duck("McDonald", 2, "Egor"))
                .addAnimal(new Eagle("Gery",2 , "Damir"))
                .addAnimal(new Fish("Dory", 0, "Anton"));
        System.out.println(zoo.toString());
        System.out.println(zoo.talk());
        for (Runable i: zoo.getRunable()){
            System.out.println(i.runSpeed());
        }
        System.out.println("Бегуны");
        System.out.println(zoo.getChampionSpeed());
        System.out.println("Летуны");
        for (Flyable i: zoo.getFlyable()){
            System.out.println(i.flySpeed());

        }
        SaveManagerAnimals saveManagerAnimals = new SaveManagerAnimals();
        saveManagerAnimals.save(zoo.getAnimals());


    }
}