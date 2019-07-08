package tutorial.hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tutorial.hotel.model.Search;
import tutorial.hotel.model.SearchResult;
import tutorial.hotel.model.SearchRoomModel;
import tutorial.hotel.repository.ReservationRepository;
import tutorial.hotel.util.SearchCollector;

import java.util.List;

@Service
public class SearchService {

    List<SearchResult> searchResultsList;

    @Autowired
    private ReservationRepository reservationrepository;

    public void searchHotels(Search searchform){
        SearchCollector searchCollector = new SearchCollector();
        for (SearchRoomModel roomsearch: searchform.getSearch()){
            System.out.println(roomsearch);
            searchResultsList = reservationrepository.getReservation(searchform.getCheck_in_date(), roomsearch.getNo_of_rooms(), searchform.getNo_of_nights(), searchCollector);
            System.out.println(searchResultsList);
        }
    }

    public List<SearchResult> getSearchResults(){
        return searchResultsList;
    }

}

