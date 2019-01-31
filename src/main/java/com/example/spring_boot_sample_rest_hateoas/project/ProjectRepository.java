package com.example.spring_boot_sample_rest_hateoas.project;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProjectRepository extends PagingAndSortingRepository<Project, Integer> {

}
