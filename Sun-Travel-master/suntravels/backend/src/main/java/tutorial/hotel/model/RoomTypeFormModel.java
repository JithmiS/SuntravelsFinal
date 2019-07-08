package tutorial.hotel.model;

public class RoomTypeFormModel {
    private float price;
    private int no_of_rooms;
    private int max_adults;
    private String type_name;

    public RoomTypeFormModel(){

    }

    public RoomTypeFormModel(float price, int no_of_rooms, int max_adults, String type_name) {
        this.price = price;
        this.no_of_rooms = no_of_rooms;
        this.max_adults = max_adults;
        this.type_name = type_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
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

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Override
    public String toString() {
        return "RoomTypeFormModel{" +
                "price=" + price +
                ", no_of_rooms=" + no_of_rooms +
                ", max_adults=" + max_adults +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
