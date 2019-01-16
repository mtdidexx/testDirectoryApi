package net.katrinka.TestDirectoryApi.animals;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@Data
public class AnimalType extends Animal {
    public AnimalType(String name, String code) {
        super(code);
        this.name = name;
    }
    private String name;
}
