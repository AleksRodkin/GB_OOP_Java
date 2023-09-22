package OOP_Java.Lesson7.Homework7;

public interface Publisher {

    void sendOffer(String companyName, String vacancy, int salary);

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
