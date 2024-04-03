package com.colak.springjpasecondlevelcachehazelcasttutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.cache.Caching;
import javax.cache.spi.CachingProvider;

@SpringBootApplication
@Slf4j
public class SpringJpaSecondLevelCacheTutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaSecondLevelCacheTutorialApplication.class, args);
    }

    // See https://stackoverflow.com/questions/51886101/spring-boot2-x-and-ehcache3-5-are-error-based-on-annotations/72642142#72642142
    @Override
    public void run(String... args) {
        Iterable<CachingProvider> iterable = Caching.getCachingProviders();
        iterable.forEach(cachingProvider -> {
            log.info("cachingProvider=" + cachingProvider);
        });
    }
}
