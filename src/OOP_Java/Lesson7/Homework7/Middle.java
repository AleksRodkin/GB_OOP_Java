package OOP_Java.Lesson7.Homework7;

public class Middle implements Observer{
    private String name;
    private String desiredJob;
    private int salary = 40000;

    public Middle(String name, String desiredJob) {
        this.name = name;
        this.desiredJob = desiredJob;
    }

//    private boolean employed = false;
//
//    public boolean isEmployed() {
//        return false;
//    }

    @Override
    public void receiveOffer(String nameCompany, String vacancy, int salary) {

        if (!vacancy.toLowerCase().equals(desiredJob.toLowerCase())) {
            System.out.printf("Мидл-специалист %s: Данная вакансия мне не подходит, ищу вакансию %s (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, desiredJob, nameCompany, vacancy, salary);

        } else if (this.salary <= salary && vacancy.toLowerCase().equals(desiredJob.toLowerCase())){
            System.out.printf("Мидл-специалист %s: Мне нужна эта работа! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
            this.salary = salary;

        } else {
            System.out.printf("Мидл-специалист %s: Я найду работу получше! (компания: %s; вакансия %s; заработная плата: %d)\n",
                    name, nameCompany, vacancy, salary);
        }
    }




}
