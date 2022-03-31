package collection;

import person.entity.Person;

import java.sql.Connection;
import java.util.List;

public interface StudentServer {
    Connection getConnection();

    void insert(List<Person> person);
}
