package br.com.riachuelo.poc.repository;

import br.com.riachuelo.poc.model.Cliente;
import io.swagger.annotations.Api;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;

@Api
@Component
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {
	
}
