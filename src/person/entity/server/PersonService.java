package person.entity.server;


import person.entity.Person;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public  interface PersonService {
    Connection getConnection();
    void insert(Person person);
    void updateFirstName(Integer id, String firstName) ;
    void updateLastName(Integer id, String lastName) ;
    void updateEmail(Integer id, String email) ;
    void updateMobile(Integer id, String mobile) ;
    void delete(Integer id) ;
    List<Person> display();
}
