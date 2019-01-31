package com.example.spring_boot_sample_rest_hateoas.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;

@Getter
@Setter
@ToString
@javax.persistence.Entity
public class Entity extends AbstractPersistable<Integer> {

    @Column(unique = true)
    private String name;

    Entity() {
        //jpa
    }

    public Entity(String name) {
        this.name = name;
    }
}
