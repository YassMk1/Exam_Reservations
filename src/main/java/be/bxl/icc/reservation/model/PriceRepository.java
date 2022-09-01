package be.bxl.icc.reservation.model;

import org.springframework.data.repository.CrudRepository;

public interface PriceRepository extends CrudRepository<Price, Long> {	
	Price findById(long id);
}
