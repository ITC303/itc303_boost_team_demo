package com.example.itc303_boost_team_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EntityScan(basePackageClasses = {
		Itc303BoostTeamDemoApplication.class,
        Jsr310JpaConverters.class
})
public class Itc303BoostTeamDemoApplication {

	public static void main(String[] args) {
	    SpringApplication.run(Itc303BoostTeamDemoApplication.class, args);
	}

	@PostConstruct
    void init() {

    }
}
