package tutorial.hotel.model;

import javax.persistence.*;

@Entity
@Table(name = "roomtypes")
public class RoomTypes {

    private int type_id;
    private int contract_id;
    private float price;
    private int no_of_rooms;
    private int max_adults;
    private String type_name;

    public RoomTypes(){

    }

    public RoomTypes(int type_id, int contract_id, float price, int no_of_rooms, int max_adults, String type_name) {
        this.type_id = type_id;
        this.contract_id = contract_id;
        this.price = price;
        this.no_of_rooms = no_of_rooms;
        this.max_adults = max_adults;
        this.type_name = type_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "type_id")
    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    @Column(name = "contract_id")
    public int getContract_id() {
        return contract_id;
    }

    public void setContract_id(int contract_id) {
        this.contract_id = contract_id;
    }

    @Column(name = "price")
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Column(name = "no_of_rooms")
    public int getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(int no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    @Column(name = "max_adults")
    public int getMax_adults() {
        return max_adults;
    }

    public void setMax_adults(int max_adults) {
        this.max_adults = max_adults;
    }

    @Override
    public String toString() {
        return "RoomTypes{" +
                "type_id=" + type_id +
                ", contract_id=" + contract_id +
                ", price=" + price +
                ", no_of_rooms=" + no_of_rooms +
                ", max_adults=" + max_adults +
                ", type_name='" + type_name + '\'' +
                '}';
    }
}
