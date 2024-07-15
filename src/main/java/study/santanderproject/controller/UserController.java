package study.santanderproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import study.santanderproject.model.User;
import study.santanderproject.service.UserService;

import java.net.URI;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Não é interessante expor tudo que está em user, depois é necessário criar um UserDto para expor apenas o necessário
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

//    @GetMapping("/name/{name}")
//    public ResponseEntity<User> findByUsername(@PathVariable String name) {
//        return ResponseEntity.ok(userService.findByUsername(name));
//    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(user.getId()).toUri();
        return ResponseEntity.created(uri).body(userService.create(user));
    }
}
