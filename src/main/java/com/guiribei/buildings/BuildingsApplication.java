package com.guiribei.buildings;

import com.guiribei.buildings.construction.Construction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class BuildingsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuildingsApplication.class, args);
	}

	@GetMapping
	public List<Construction> hello() {
		return List.of(
				new Construction(
						1L,
						"Pátio",
						"Rua da Praça",
						"www.google.com"
				)
		);
	}
}
