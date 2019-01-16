package net.katrinka.TestDirectoryApi.repositories;

import net.katrinka.TestDirectoryApi.animals.AnimalType;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class AnimalGroupTypeRepository {

    public Set<AnimalType> findAll() {
        Set<AnimalType> animalTypes = new HashSet<>();
        animalTypes.add(new AnimalType("Avian", "AVIAN"));
        animalTypes.add(new AnimalType("Bovids", "BOVID"));
        return animalTypes;
    }
}
