package tutorial.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tutorial.hotel.model.Search;
import tutorial.hotel.model.SearchResult;
import tutorial.hotel.model.SearchRoomModel;
import tutorial.hotel.repository.ReservationRepository;
import tutorial.hotel.service.SearchService;
import tutorial.hotel.util.SearchCollector;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class SearchController {


    @Autowired
    private ReservationRepository reservationrepository;

    @Autowired
    private SearchService searchService;

    @PostMapping("/reservation")
    public void search(@Valid @RequestBody Search searchform){
        searchService.searchHotels(searchform);
    }

    @GetMapping("/reservation")
    public List<SearchResult> getSearchResult(){
        return searchService.getSearchResults();
    }

}
