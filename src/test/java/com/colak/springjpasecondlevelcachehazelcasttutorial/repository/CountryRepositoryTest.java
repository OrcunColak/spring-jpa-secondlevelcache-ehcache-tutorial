package com.colak.springjpasecondlevelcachehazelcasttutorial.repository;

import com.colak.springjpasecondlevelcachehazelcasttutorial.jpa.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CountryRepositoryTest {

    @Autowired
    private CountryRepository repository;

    @Test
    void findAll() {
        List<Country> all = repository.findAll();
        assertThat(all).isNotEmpty();

        // Fo L2 hit we need to find by id
        Optional<Country> byId = repository.findById(1L);
        assertThat(byId).isPresent();
        Country country = byId.get();
        assertThat(country).isNotNull();
    }
}
