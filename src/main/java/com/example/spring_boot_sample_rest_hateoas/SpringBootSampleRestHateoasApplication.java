package com.example.spring_boot_sample_rest_hateoas;

import com.example.spring_boot_sample_rest_hateoas.entity.Entity;
import com.example.spring_boot_sample_rest_hateoas.entity.EntityRepository;
import com.example.spring_boot_sample_rest_hateoas.project.Project;
import com.example.spring_boot_sample_rest_hateoas.project.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@SpringBootApplication
public class SpringBootSampleRestHateoasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleRestHateoasApplication.class, args);
	}

	@Component
	class SampleDataCLR  implements CommandLineRunner {

		private final EntityRepository entityRepository;
		private final ProjectRepository projectRepository;

		public SampleDataCLR(EntityRepository entityRepository, ProjectRepository projectRepository) {
			this.entityRepository = entityRepository;
			this.projectRepository = projectRepository;
		}

		@Override
		public void run(String... strings) throws Exception {
			Stream.of("AKT Altmärker GmbH", "Automotive Lighting Reutlingen GmbH").forEach(u -> entityRepository.save(new Entity(u)));
			entityRepository.findAll().forEach(System.out::println);

			Entity entity = entityRepository.findByName("AKT Altmärker GmbH");
			projectRepository.save(new Project("Project 1", entity));
			projectRepository.findAll().forEach(System.out::println);
		}
	}

}
