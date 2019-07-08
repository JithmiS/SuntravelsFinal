package tutorial.hotel.repository;

import org.springframework.data.repository.CrudRepository;
import tutorial.hotel.model.RoomTypes;


public interface RoomTypesRepository extends CrudRepository<RoomTypes, Integer> {
}
