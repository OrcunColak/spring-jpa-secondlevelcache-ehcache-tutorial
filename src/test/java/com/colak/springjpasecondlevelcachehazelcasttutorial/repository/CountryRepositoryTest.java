package com.colak.springjpasecondlevelcachehazelcasttutorial.repository;

import com.colak.springjpasecondlevelcachehazelcasttutorial.jpa.Country;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CountryRepositoryTest {

    @Autowired
    private CountryRepository repository;

    @Test
    void findAll() {
        List<Country> all = repository.findAll();
        assertThat(all).isNotEmpty();

        all = repository.findAll();
        assertThat(all).isNotEmpty();
    }
}
