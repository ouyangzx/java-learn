package org.acme.spring.data.rest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FruitsRepository extends PagingAndSortingRepository<Fruit, Long> {
//
//    @Override
//    default Page<Fruit> findAll(Pageable pageable) {
//        Page<Fruit> fruits = this.findAll(pageable);
//        System.out.println("fruits = " + fruits);
//
//        List<Fruit> content = fruits.getContent();
//        for (Fruit fruit : content) {
//
//        }
//        return null;
//    }
}
