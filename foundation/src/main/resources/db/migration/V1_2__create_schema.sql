CREATE TABLE cbfs_foundation (
    id INT8 NOT NULL,
    name VARCHAR(255) NOT NULL,
    person_id INT8 NOT NULL,
    FOREIGN KEY (person_id) REFERENCES cbfs_person(id)
);
