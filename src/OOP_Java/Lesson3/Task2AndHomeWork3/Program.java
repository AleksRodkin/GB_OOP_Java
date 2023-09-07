package OOP_Java.Lesson3.Task2AndHomeWork3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    public static Employee generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 60);

        int salaryIndex = random.nextInt(200, 500);
        int employeeIndex = random.nextInt(0, 2);

        if (employeeIndex == 0) {
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 50 * salaryIndex, age);
        } else {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 200 * salaryIndex, age);
        }
    }

    public static Employee[] generateWorkers(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        return workers;
    }

    public static void main(String[] args) {

        Employee[] workers = generateWorkers(12);

        for (Employee worker: workers) {
            System.out.println(worker);
        }
        System.out.println();
        System.out.println("Было создано " + Worker.getCounter() + " работников");
        System.out.println("Было создано " + Freelancer.getCounter() + " фрилансеров");

        Arrays.sort(workers, new AgeComparator());

        System.out.println();

        for (Employee worker: workers) {
            System.out.println(worker);
        }

    }

}

