package org.acme.spring.data.rest;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface TypeRepository extends PagingAndSortingRepository<Type, Long> {
}
