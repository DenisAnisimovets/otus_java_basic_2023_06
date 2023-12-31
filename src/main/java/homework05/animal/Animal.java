package homework05.animal;

public abstract class Animal {
    String name;
    int speedRun;
    int speedSwim;
    int stamina;
    final int needStaminaRun = 1;
    int needStaminaSwim = 1000;

    public int getStamina() {
        return stamina;
    }

    public String info() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speedRun='" + speedRun + '\'' +
                ", speedSwim='" + speedSwim + '\'' +
                ", stamina=" + stamina +
                '}';
    }

    public int run(int distance) {
        if (stamina >= distance * needStaminaRun) {
            stamina -= distance * needStaminaRun;
            System.out.println(name + " пробежал(а) " + distance + " метров");
            return distance / speedRun;
        } else {
            System.out.println("У " + name + " появилась усталость");
            return -1;
        }
    }

    public int swim(int distance) {
        if (stamina > distance * needStaminaSwim) {
            stamina -= distance * needStaminaSwim;
            System.out.println(name + " проплыл(а) " + distance + " метров");
            return distance / speedRun;
        } else {
            System.out.println("У" + name + "появилась усталость");
            return -1;
        }
    }
}

