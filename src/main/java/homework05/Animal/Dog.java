package homework05.Animal;

public class Dog extends Animal {

    int needStaminaSwim = 2;

    public Dog(String name, int speedRun, int speedSwim, int stamina) {
        this.name = name;
        this.speedRun = speedRun;
        this.speedSwim = speedSwim;
        this.stamina = stamina;
    }

}
