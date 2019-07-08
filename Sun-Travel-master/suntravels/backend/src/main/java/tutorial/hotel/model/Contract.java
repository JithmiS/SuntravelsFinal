package tutorial.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

import java.sql.Date;

@Entity
@Table(name = "contracts")
public class Contract {

    private int contract_id;
    private Date start_date;
    private Date end_date;
    private double markup;
    private int hotel_id;

    public Contract(){

    }

    public Contract(int contract_id, Date start_date, Date end_date, double markup, int hotelId) {
        this.contract_id = contract_id;
        this.start_date = start_date;
        this.end_date = end_date;
        this.markup = markup;
        this.hotel_id = hotel_id;
    }

    @Id
    @Column(name = "contract_id", nullable = false)
    public int getContractId() {
        return contract_id;
    }

    public void setContractId(int contract_id) {
        this.contract_id = contract_id;
    }

    @Column(name = "start_date", nullable = false)
    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
        this.start_date = start_date;
    }

    @Column(name = "end_date", nullable = false)
    public Date getEndDate() {
        return end_date;
    }

    public void setEndDate(Date end_date) {
        this.end_date = end_date;
    }

    @Column(name = "markup", nullable = false)
    public double getMarkup() {
        return markup;
    }

    public void setMarkup(double markup) {
        this.markup = markup;
    }

    @Column(name = "hotel_id", nullable = false)
    public int getHotelId() {
        return hotel_id;
    }

    public void setHotelId(int hotelId) {
        this.hotel_id = hotelId;
    }

    @Override
    public String toString() {
        return "Contract [contractId=" + contract_id + ", start_date=" + start_date + ", end_date=" + end_date + ", markup="
                + markup + ", hotelId=" + hotel_id + "]";
    }


}
