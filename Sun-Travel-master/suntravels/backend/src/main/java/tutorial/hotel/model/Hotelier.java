package tutorial.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name = "hotel")
public class Hotelier {

    private int hotel_id;
    private String hotelName;
    private String location;
    private String telephone;

    public Hotelier(){

    }

    public Hotelier(int hotel_id, String hotelName, String location, String telephone){
        this.hotel_id = hotel_id;
        this.hotelName = hotelName;
        this.location = location;
        this.telephone = telephone;
    }

    @Id
    @Column(name = "hotel_id")
    public int getId() {
        return hotel_id;
    }

    public void setId(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    @Column(name = "Hotel_name", nullable = false)
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Column(name = "Location", nullable = false)
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    @Column(name = "telephone", nullable = false)
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Hotelier{" +
                "hotel_id=" + hotel_id+
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}

