package OOP_Java.Lesson7.Homework7;

import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private String[] vacancies;
    private int maxSalary;


    public Company(String name, Publisher jobAgency, String[] vacancy, int maxSalary) {
        this.name = name;
        this.jobAgency = jobAgency;
        this.vacancies = vacancy;
        this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        String vacancy = vacancies[random.nextInt(vacancies.length)];
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, vacancy, salary);
    }
}