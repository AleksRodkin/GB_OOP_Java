package OOP_Java.Homework2;

public class Plate {
    private static int food;

    public static int getFood() {
        return food;
    }

    public void setFood(int food) {
        checkFood(food);
    }

    public Plate(int food) {
        this.food = food;
        checkFood(food);
    }
    public void info() {
        if (getFood() == 0) {
            System.out.println("Миска пуста");
        }
        else {
            System.out.println(String.format("В миске %d еды", food));
        }
    }

    private void checkFood(int food){
        if (food < 0){
            throw new RuntimeException("Количество еды не может быть отрицательным");
        }
        else {
            this.food = food;
        }
    }

    public void addFood(int addedFood){
        setFood(getFood() + addedFood);
        System.out.println("-----------------");
        System.out.println(String.format("Добавили %d еды", addedFood));
        System.out.println("-----------------");
    }
}



