package br.com.riachuelo.poc.repository;

import br.com.riachuelo.poc.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Component
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
	
}
