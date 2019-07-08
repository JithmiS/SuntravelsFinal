package tutorial.hotel.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tutorial.hotel.model.Hotelier;

public interface HotelierRepository extends CrudRepository<Hotelier, Integer> {

}
