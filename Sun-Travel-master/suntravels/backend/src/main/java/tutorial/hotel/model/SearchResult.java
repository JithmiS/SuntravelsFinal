package tutorial.hotel.model;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.SqlResultSetMapping;
import java.math.BigDecimal;

public class SearchResult {
    private Integer hotel_id;
    private Double markup;
    private Float price;
    private String type_name;
    private Integer no_of_rooms;
    private Integer max_adults;

    public SearchResult(Object[] columns) {
        this.hotel_id = ((Integer)columns[0]);
        this.markup = ((Double)columns[1]);
        this.price = ((Float)columns[2]);
        this.type_name = ((String)columns[3]);
        this.no_of_rooms = ((Integer)columns[4]);
        this.max_adults = ((Integer)columns[5]);
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public Double getMarkup() {
        return markup;
    }

    public void setMarkup(Double markup) {
        this.markup = markup;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(Integer no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public Integer getMax_adults() {
        return max_adults;
    }

    public void setMax_adults(Integer max_adults) {
        this.max_adults = max_adults;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "hotel_id=" + hotel_id +
                ", markup=" + markup +
                ", price=" + price +
                ", type_name='" + type_name + '\'' +
                ", no_of_rooms=" + no_of_rooms +
                ", max_adults=" + max_adults +
                '}';
    }
}

/*public class SearchResult {
    private String hotel_name;
    private Double markup;
    private Float price;
    private String type_name;
    private Integer no_of_rooms;
    private Integer max_adults;

    public SearchResult(Object[] columns) {
        this.hotel_name = ((String)columns[0]);
        this.markup = ((Double)columns[1]);
        this.price = ((Float)columns[2]);
        this.type_name = ((String)columns[3]);
        this.no_of_rooms = ((Integer)columns[4]);
        this.max_adults = ((Integer)columns[5]);
    }

    public String getHotel_id() {
        return hotel_name;
    }

    public void setHotel_id(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public Double getMarkup() {
        return markup;
    }

    public void setMarkup(Double markup) {
        this.markup = markup;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public Integer getNo_of_rooms() {
        return no_of_rooms;
    }

    public void setNo_of_rooms(Integer no_of_rooms) {
        this.no_of_rooms = no_of_rooms;
    }

    public Integer getMax_adults() {
        return max_adults;
    }

    public void setMax_adults(Integer max_adults) {
        this.max_adults = max_adults;
    }

    @Override
    public String toString() {
        return "SearchResult{" +
                "hotel_id=" + hotel_name +
                ", markup=" + markup +
                ", price=" + price +
                ", type_name='" + type_name + '\'' +
                ", no_of_rooms=" + no_of_rooms +
                ", max_adults=" + max_adults +
                '}';
    }
}*/
