package org.hibernate.processor.test.data.hhh20212;

import jakarta.data.repository.CrudRepository;
import jakarta.data.repository.Find;
import jakarta.data.repository.Repository;

@Repository
public interface HHH20212Repository extends CrudRepository<HHH20212Entity, Long> {
	@Find
	HHH20212Entity byId(Long id);
}
