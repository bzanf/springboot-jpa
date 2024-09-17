package org.project.springboot_jpa.resources;

import org.project.springboot_jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findOne() {
        return ResponseEntity.ok().body(new User(1L, "jorge", "jorge@mail.com","4899999999","1234"));
    }
}
