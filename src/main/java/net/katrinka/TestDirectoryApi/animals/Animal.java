package net.katrinka.TestDirectoryApi.animals;

import lombok.Data;

import java.time.Instant;

@Data
public class Animal {
    public Animal(String code) {
        this.code = code;
        this.created = Instant.now();
        this.updated = Instant.now();
    }
    private String code;
    private Instant created;
    private Instant updated;
}
