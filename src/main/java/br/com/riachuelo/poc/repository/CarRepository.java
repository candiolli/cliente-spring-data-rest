package br.com.riachuelo.poc.repository;

import br.com.riachuelo.poc.model.Car;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Api
@Component
public interface CarRepository extends PagingAndSortingRepository<Car, Long> {
	
}
