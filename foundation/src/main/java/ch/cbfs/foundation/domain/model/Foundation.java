package ch.cbfs.foundation.domain.model;

import ch.cbfs.core.domain.model.Person;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "cbfs_foundation")
public class Foundation {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(
            name = "person_id",
            nullable = false,
            updatable = false
    )
    private Person person;

    public Foundation() {
    }

    public Foundation(Long id, String name, Person person) {
        this.id = id;
        this.name = name;
        this.person = person;
    }
}
