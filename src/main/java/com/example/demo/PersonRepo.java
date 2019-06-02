package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Person;
@RepositoryRestResource(collectionResourceRel="persons",path="persons")
public interface PersonRepo extends JpaRepository<Person,Integer>{

}
