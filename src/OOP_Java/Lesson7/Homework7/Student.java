package OOP_Java.Lesson7.Homework7;

public class Student implements Observer{

    private String name;
    private String desiredJob;
    private int salary = 20000;

//    private boolean employed = false;

//    public boolean isEmployed() {
//        return false;
//    }

    public Student(String name, String desiredJob) {
        this.name = name;
        this.desiredJob = desiredJob;
    }

    @Override
    public void receiveOffer(String nameCompany, String vacancy, int salary) {

        if (!vacancy.toLowerCase().equals(desiredJob.toLowerCase())) {
            System.out.printf("Студент %s: Данная вакансия мне не подходит, ищу вакансию %s (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, desiredJob, nameCompany, vacancy, salary);

        } else if (this.salary <= salary && vacancy.toLowerCase().equals(desiredJob.toLowerCase())){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;

        } else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }



}
