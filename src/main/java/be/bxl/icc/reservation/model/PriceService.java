package be.bxl.icc.reservation.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PriceService {
	@Autowired
	private PriceRepository priceRepository;
		
	public List<Price> getAllPrices() {
		List<Price> prices = new ArrayList<>();
		
		priceRepository.findAll().forEach(prices::add);
		
		return prices;
	}
	
	public Price getPrice(String id) {
		int indice = Integer.parseInt(id);
		
		return priceRepository.findById(indice);
	}

	public void addPrice(Price price) {
		priceRepository.save(price);
	}

	public void updatePrice(Long long1, Price price) {
		priceRepository.save(price);
	}

	public void deletePrice(Long indice2) {
		Long indice = indice2;
		
		priceRepository.deleteById(indice);
	}
}

