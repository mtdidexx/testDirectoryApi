package net.katrinka.TestDirectoryApi.tests;

import lombok.Data;
import lombok.EqualsAndHashCode;
import net.katrinka.TestDirectoryApi.animals.Animal;

import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
public class Assay extends Test {
    private Set<Animal> animals;
}
