CREATE TABLE IF NOT EXISTS person (
    person_id INT(11) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(30),
    last_name VARCHAR(30),
    salary INT(11),
    PRIMARY KEY (person_id)
);