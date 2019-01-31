package com.example.spring_boot_sample_rest_hateoas.entity;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EntityRepository extends PagingAndSortingRepository<Entity, Integer> {

    Entity findByName(@Param("name") String name);

    List<Entity> findByNameOrId(@Param("name") String name, @Param("id") Integer id);

}
