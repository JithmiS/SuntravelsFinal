package tutorial.hotel.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import tutorial.hotel.model.SearchResult;
import tutorial.hotel.util.SearchCollector;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import java.sql.Date;
import java.util.List;

@Repository
@Transactional
public class ReservationRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List<SearchResult> getReservation(Date end_date, Integer no_of_rooms, Integer max_adults, SearchCollector searchCollector){

//        Query query = entityManager.createNativeQuery("SELECT DISTINCT hotel_name, markup, price, type_name, no_of_rooms, max_adults from contracts c " +
//                ", roomtypes r, hotel h WHERE c.end_date > ? AND r.no_of_rooms >= ? " +
//                "AND r.max_adults = ?").setParameter(1, end_date).setParameter(2, no_of_rooms).setParameter(3, max_adults);


        Query query = entityManager.createNativeQuery("SELECT hotel_id, markup, price, type_name, no_of_rooms, max_adults from contracts c " +
                "left join roomtypes r on c.contract_id =r.contract_id WHERE c.end_date > ? AND r.no_of_rooms >= ? " +
                "AND r.max_adults = ?").setParameter(1, end_date).setParameter(2, no_of_rooms).setParameter(3, max_adults);

        System.out.println(query.getResultList().get(0).getClass().getTypeName());

        for(int i=0; i<query.getResultList().size(); i++){
            SearchResult s = new SearchResult((Object[]) query.getResultList().get(i));
            searchCollector.getSearchlist().add(s);
        }
        return searchCollector.getSearchlist();


    }

}
