package DIO_API_REST_Spring_Web_Swagger.controller;


import DIO_API_REST_Spring_Web_Swagger.domain.User;
import DIO_API_REST_Spring_Web_Swagger.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@RestController
public class UserController {


    @Autowired
    private UserRepository userRepository;


    @GetMapping("/users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }


   @Operation(
           summary = "Buscar usuário por ID",
           description = "Retorna um usuário a partir do ID"
   )
   @ApiResponses({
           @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
           @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
   })
    @GetMapping("/user/{login}")
    public User getUserByLogin(@PathVariable String login) {
        return userRepository.findByLogin(login);
    }

    @PutMapping("/user")
    public void updateUser(@RequestBody User user) {
        userRepository.update(user);

    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }


    @DeleteMapping("/user/{id}")
    public void deleteUserById(@PathVariable Integer id) {
        userRepository.deleteById(id);  }
}
