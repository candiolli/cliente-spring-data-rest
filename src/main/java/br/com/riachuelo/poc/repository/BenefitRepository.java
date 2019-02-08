package br.com.riachuelo.poc.repository;

import br.com.riachuelo.poc.model.Benefit;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "benefitsCustomer", path = "benefitsCustomer")
public interface BenefitRepository extends PagingAndSortingRepository<Benefit, Long> {
}
