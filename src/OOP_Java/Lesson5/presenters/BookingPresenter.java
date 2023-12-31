package OOP_Java.Lesson5.presenters;

import OOP_Java.Lesson5.models.Table;
import OOP_Java.Lesson5.models.TableModel;
import OOP_Java.Lesson5.views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model tableModel;
    private final View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }
    public void updateTablesUI(){
        bookingView.showTables(loadTables());
    }

    public void updateReservationResultUI(int reservationId){
        bookingView.printReservationTableResult(reservationId);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }
}

