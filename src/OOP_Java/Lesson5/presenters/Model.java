package OOP_Java.Lesson5.presenters;

import OOP_Java.Lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Table> loadTables();
    int reservationTable(Date reservationDate, int tableNo, String name);

}