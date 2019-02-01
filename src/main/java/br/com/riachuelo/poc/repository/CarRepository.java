package br.com.riachuelo.poc.repository;

import br.com.riachuelo.poc.model.Car;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
	
}
