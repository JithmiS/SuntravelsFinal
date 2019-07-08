package tutorial.hotel.model;

import java.sql.Date;
import java.util.ArrayList;

public class Search {

    private Date check_in_date;
    private int no_of_nights;
    private ArrayList<SearchRoomModel> search;

    public Search(Date check_in_date, int no_of_nights, ArrayList<SearchRoomModel> search) {
        this.check_in_date = check_in_date;
        this.no_of_nights = no_of_nights;
        this.search = search;
    }

    public Date getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(Date check_in_date) {
        this.check_in_date = check_in_date;
    }

    public int getNo_of_nights() {
        return no_of_nights;
    }

    public void setNo_of_nights(int no_of_nights) {
        this.no_of_nights = no_of_nights;
    }

    public ArrayList<SearchRoomModel> getSearch() {
        return search;
    }

    public void setSearch(ArrayList<SearchRoomModel> search) {
        this.search = search;
    }

    @Override
    public String toString() {
        return "Search{" +
                "check_in_date=" + check_in_date +
                ", no_of_nights=" + no_of_nights +
                ", search=" + search +
                '}';
    }

}
