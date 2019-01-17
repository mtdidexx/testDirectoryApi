package net.katrinka.TestDirectoryApi.controllers;

import lombok.extern.slf4j.Slf4j;
import net.katrinka.TestDirectoryApi.animals.AnimalType;
import net.katrinka.TestDirectoryApi.repositories.AnimalGroupTypeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@Slf4j
public class AnimalController {
    private AnimalGroupTypeRepository animalGroupTypeRepository;

    public AnimalController(AnimalGroupTypeRepository animalGroupTypeRepository) {
        this.animalGroupTypeRepository = animalGroupTypeRepository;
    }

    @GetMapping("/animalTypes")
    public Set<AnimalType> animalTypes() {
        log.info("Animal Types");
        return animalGroupTypeRepository.findAll();
    }
}
