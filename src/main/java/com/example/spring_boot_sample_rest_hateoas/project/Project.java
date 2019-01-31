package com.example.spring_boot_sample_rest_hateoas.project;

import com.example.spring_boot_sample_rest_hateoas.entity.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@javax.persistence.Entity
public final class Project extends AbstractPersistable<Integer> {

    private String name;

    @ManyToOne
    @JoinColumn(name = "entityId", nullable = false)
    private Entity entity;

    private Project() {
        //jpa
    }

    public Project(String name, Entity entity) {
        this.name = name;
        this.entity = entity;
    }
}
