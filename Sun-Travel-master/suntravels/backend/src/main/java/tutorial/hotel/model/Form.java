package tutorial.hotel.model;

import java.sql.Date;
import java.util.ArrayList;

public class Form {

    private Date start_date;
    private Date end_date;
    private double markup;
    private int hotel_id;
    private ArrayList<RoomTypeFormModel> roomtypes;


    public Form(Date start_date, Date end_date, double markup, int hotel_id, ArrayList<RoomTypeFormModel> roomtypes) {
        this.start_date = start_date;
        this.end_date = end_date;
        this.markup = markup;
        this.hotel_id = hotel_id;
        this.roomtypes = roomtypes;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public ArrayList<RoomTypeFormModel> getRoom_types() {
        return roomtypes;
    }

    public void setRoom_types(ArrayList<RoomTypeFormModel> roomtypes) {
        this.roomtypes = roomtypes;
    }

    @Override
    public String toString() {
        return "Form{" +
                "start_date=" + start_date +
                ", end_date=" + end_date +
                ", markup=" + markup +
                ", hotel_id=" + hotel_id +
                ", room_types=" + roomtypes +
                '}';
    }
}
