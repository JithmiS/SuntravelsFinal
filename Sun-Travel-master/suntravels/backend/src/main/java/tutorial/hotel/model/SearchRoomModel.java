package tutorial.hotel.model;

public class SearchRoomModel {
    private int no_of_rooms;
    private int max_adults;

    public SearchRoomModel(){

    }

    public SearchRoomModel(int no_of_rooms, int max_adults) {
        this.no_of_rooms = no_of_rooms;
        this.max_adults = max_adults;
    }

    public int getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public int getMax_adults() {
        return max_adults;
    }

    public void setMax_adults(int max_adults) {
        this.max_adults = max_adults;
    }

    @Override
    public String toString() {
        return "SearchRoomModel{" +
                "no_of_rooms=" + no_of_rooms +
                ", max_adults=" + max_adults +
                '}';
    }

}
