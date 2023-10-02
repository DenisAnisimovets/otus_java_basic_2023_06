package homework05.Animal;

public class Cat extends Animal {

    public Cat(String name, int speedRun, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.stamina = stamina;
    }

    @Override
    public int swim(int distance) {
        System.out.println("Кот не умеет плавать");
        return -1;
    }


}