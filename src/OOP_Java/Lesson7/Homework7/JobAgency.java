package OOP_Java.Lesson7.Homework7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    public List<Observer> getObservers() {
        return observers;
    }

    @Override
    public void sendOffer(String companyName, String vacancy, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, vacancy, salary);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}