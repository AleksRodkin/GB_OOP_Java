package OOP_Java.Lesson5;

import OOP_Java.Lesson5.models.TableModel;
import OOP_Java.Lesson5.presenters.BookingPresenter;
import OOP_Java.Lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();

        view.reservationTable(new Date(), 3, "Станислав");

        view.changeReservationTable(101, new Date(), 1, "Станислав");
    }

}
