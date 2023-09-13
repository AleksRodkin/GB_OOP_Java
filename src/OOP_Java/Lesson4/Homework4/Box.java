package OOP_Java.Lesson4.Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Box<T extends Fruit> {
    private List<T> arr = new ArrayList<>();
    private int counter;
    private float weight;

    public Box() {
    }

    public int getCounter() {
        this.counter = arr.size();
        return this.counter;

    }

    public void add(T fruit) {
        arr.add(fruit);
    }

    public T removeFruits() {
        T item = this.arr.remove(getCounter() - 1);
        return item;
    }

    public void showBox() {
        Stream.of(arr.toString())
                .forEach(System.out::println);
    }

    public float getWeight() {
        if (getCounter() > 0) {
            this.weight = arr.get(0).getWeight() * getCounter();
            return weight;
        } else {
            return 0;
        }
    }

    public static <T extends Box<K>, K extends Fruit> T moveAllFruits(T from, T to, int count) {
        if (from.getCounter() > count) {
            for (int i = 0; i < count; i++) {
                to.add(from.removeFruits());
            }
            return to;
        } else {
            throw new RuntimeException("В коробке нет фруктов");
        }
    }

    public boolean compareBoxes(Box o2) {
        int res = new BoxWeightComparator().compare(this, o2);
        if (res > 0)
            return true;
        else
            return false;
    }
}
