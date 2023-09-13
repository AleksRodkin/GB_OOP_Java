package OOP_Java.Lesson4.Homework4;

public class Program {
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();

        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        box1.showBox();
        System.out.println("Вес коробки - " + box1.getWeight());

        Box<Apple> box2 = new Box<>();
        Box.moveAllFruits(box1, box2, 4);
        box1.showBox();
        box2.showBox();

        System.out.println("Вес коробки 1 - " + box1.getWeight());
        System.out.println("Вес коробки 2 - " + box2.getWeight());

        System.out.println(box1.compareBoxes(box2));
    }
}
