package ch.cbfs.core.domain.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cbfs_person")
public class Person {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    public Person() {
    }

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
