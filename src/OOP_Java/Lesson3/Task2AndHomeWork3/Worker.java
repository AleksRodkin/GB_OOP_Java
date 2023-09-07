package OOP_Java.Lesson3.Task2AndHomeWork3;

/**
 * Обычный рабочий (фулл-тайм)
 */
public class Worker extends Employee{

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    {
        counter++;
    }

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s, %d; Рабочий; Среднемесячная заработная плата (фиксированная) %.2f",
                surName, name, age, salary);
    }
}