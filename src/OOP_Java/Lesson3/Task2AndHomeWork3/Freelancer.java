package OOP_Java.Lesson3.Task2AndHomeWork3;

/**
 * Фрилансер
 */
public class Freelancer extends Employee {

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    public Freelancer(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d; Фрилансер; Заработная плата (договорная) %.2f",
                surName, name, age, salary);
    }
}