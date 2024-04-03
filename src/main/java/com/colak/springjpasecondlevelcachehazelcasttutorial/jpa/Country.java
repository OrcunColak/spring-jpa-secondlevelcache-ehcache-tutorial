package com.colak.springjpasecondlevelcachehazelcasttutorial.jpa;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.util.Objects;


@Table(name = "countries")
@Entity
@Cacheable
// This will create a cache having name "country"
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "country")

@Getter
@Setter
public class Country {

    @Id
    private Long id;

    private String name;

}
