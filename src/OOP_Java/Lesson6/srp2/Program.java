package OOP_Java.Lesson6.srp2;

public class Program {

    public static void main(String[] args) {

        Order order = new Order();
        order.inputFromConsole();
        order.saveOrder("order", "json");

    }
}
