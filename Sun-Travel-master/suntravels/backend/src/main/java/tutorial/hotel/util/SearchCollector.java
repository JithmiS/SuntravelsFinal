package tutorial.hotel.util;

import tutorial.hotel.model.SearchResult;

import java.util.ArrayList;
import java.util.List;

public class SearchCollector {

    private List<SearchResult> searchlist;

    public SearchCollector(){
        this.searchlist = new ArrayList<>();

    }

    public List<SearchResult> getSearchlist() {
        return searchlist;
    }

    public void setSearchlist(List<SearchResult> searchlist) {
        this.searchlist = searchlist;
    }

    @Override
    public String toString() {
        return "SearchCollector{" +
                "searchlist=" + searchlist +
                '}';
    }
}
