package tutorial.hotel.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tutorial.hotel.model.Contract;
import tutorial.hotel.model.Hotelier;
import tutorial.hotel.model.RoomTypes;
import tutorial.hotel.repository.ContractRepository;
import tutorial.hotel.repository.HotelierRepository;
import org.springframework.web.bind.annotation.RequestBody;
import tutorial.hotel.repository.ReservationRepository;
import tutorial.hotel.repository.RoomTypesRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import java.sql.Date;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class HotelController {
	
	@Autowired
	private HotelierRepository hotelierrepository;

    @Autowired
    private ContractRepository contractrepository;

    @Autowired
    private RoomTypesRepository roomtypesrepository;

    @Autowired
    private ReservationRepository reservationrepository;


    @GetMapping("/hotels")
    public Iterable<Hotelier> getAllHotelier(){
    	return hotelierrepository.findAll();
    }

//    @GetMapping("/hotels")
//    public List<Hotelier> getAllHotelier(){
//        return hotelierrepository.findAll();
//    }


//    @GetMapping("/contracts")
//    public @ResponseBody Iterable<Contract> getAllContracts(){
//        return contractrepository.findAll();
//    }

    @PostMapping("/hotels")
    public Hotelier createHotel(@Valid @RequestBody Hotelier hotelier) {
        return hotelierrepository.save(hotelier);
    }

//    @PostMapping("/contracts")
//    public Contract createContract(@Valid @RequestBody Contract contract) {
//        return contractrepository.save(contract);
//    }

    @GetMapping("/roomtypes")
    public @ResponseBody Iterable<RoomTypes> getAllRoomTypes(){
        return roomtypesrepository.findAll();
    }

    @PostMapping("/roomtypes")
    public RoomTypes createRoomtype(@Valid @RequestBody RoomTypes roomTypes) {
        return roomtypesrepository.save(roomTypes);
    }


}
