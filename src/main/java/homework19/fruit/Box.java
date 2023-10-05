package homework19.fruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {

    private List<T> list = new ArrayList<>();

    public int getBoxWeight() {
        return list.stream().mapToInt(Fruit::getWeight).sum();
    }

    public void add(T fruit) {
        list.add(fruit);
    }

    @Override
    public int compareTo(Box o) {
        return Integer.compare(getBoxWeight(), o.getBoxWeight());
    }

    public void moveToOtherBox(Box<T> box) {
        if(!(box == null)) {
            for (T t : list) {
                box.add(t);
            }
            list.clear();
        }
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }
}
