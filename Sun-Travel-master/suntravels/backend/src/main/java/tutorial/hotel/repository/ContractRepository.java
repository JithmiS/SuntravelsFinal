package tutorial.hotel.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tutorial.hotel.model.Contract;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public interface ContractRepository extends CrudRepository<Contract, Integer>{
    @Query(value = "SELECT contract_id FROM contracts u WHERE u.markup = :markup and u.start_date =:start_date and u.end_date =:end_date and u.hotel_id=:hotel_id", nativeQuery = true)
    Integer getContractId(@Param("markup") Double markup, @Param("start_date") Date start_date, @Param("end_date") Date end_date, @Param("hotel_id") Integer hotel_id);
}
