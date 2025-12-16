package DIO_API_REST_Spring_Web_Swagger.repository;

import DIO_API_REST_Spring_Web_Swagger.domain.User;
import ch.qos.logback.core.encoder.JsonEscapeUtil;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {


    public void save(User user) {
        // Simulating saving the user to a database
        System.out.println("User saved: " + user);
    }

    public User findByLogin(String login) {
        // Simulating retrieving the user from a database
        System.out.println("Finding user by login: " + login);
        return new User("John Doe", login, "password123");
    }

    public void update(User user) {
        // Simulating updating the user in a database
        System.out.println("User updated: " + user);
    }

    public List<User> findAll() {
        // Simulating retrieving all users from a database
        System.out.println("Finding all users");
        return List.of(
                new User("John Doe", "johndoe", "password123"),
                new User("Jane Smith", "janesmith", "password456")
        );
    }



    public void deleteById(Integer id) {
        // Simulating deleting the user from a database
        System.out.println("User deleted: " + id);
    }




}
