package OOP_Java.Lesson7.Homework7;

public class Program {

    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();

        String[] googleVacancies = new String[]{"Программист", "Инженер", "Менеджер", "Тестировщик"};
        String[] yandexVacancies = new String[]{"Программист", "Секретарь", "Менеджер", "Тестировщик"};
        String[] geekBrainsVacancies = new String[]{"Инженер", "Менеджер", "Тестировщик", "Аналитик", "Секретарь"};

        Company google = new Company("Google", jobAgency, googleVacancies, 120000);
        Company yandex = new Company("Yandex", jobAgency, yandexVacancies, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, geekBrainsVacancies, 98000);

        Student student1 = new Student("Petrov", "Программист");
        Middle middle1 = new Middle("Mr.Turtle", "Тестировщик");
        Master master1 = new Master("Ivanov", "Менеджер");
        Master master2 = new Master("Sidorov", "Инженер");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(middle1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);

        for (int i = 0; i < 2; i++){
            System.out.println("++++++++++++++++++++++++++++");
            google.needEmployee();
            System.out.println("----------------------------");
            yandex.needEmployee();
            System.out.println("----------------------------");
            geekBrains.needEmployee();
            System.out.println("----------------------------");
        }

    }

}
