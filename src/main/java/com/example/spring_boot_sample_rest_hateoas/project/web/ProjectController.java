package com.example.spring_boot_sample_rest_hateoas.project.web;

import com.example.spring_boot_sample_rest_hateoas.project.Project;
import com.example.spring_boot_sample_rest_hateoas.project.ProjectRepository;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Project REST controller with custom operations
 *
 * @author simon
 */
//@RepositoryRestController
//@RequestMapping("projects")
public class ProjectController {

//    private final ProjectRepository repository;
//
//    public ProjectController(ProjectRepository repository) {
//        this.repository = repository;
//    }
//
//    @RequestMapping(method = RequestMethod.POST)
//    public @ResponseBody
//    PersistentEntityResource post(@RequestBody Project project, PersistentEntityResourceAssembler assembler) {
//        // sample custom project name
//        project.setName(project.getName() + " - Custom name");
//        Project entity = this.repository.save(project);
//        return assembler.toResource(entity);
//    }

}