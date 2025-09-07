package com.spring_security.api;

import com.spring_security.dto.UserDto;
import com.spring_security.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserApi {
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody  @Valid  UserDto dto){
        System.out.println(dto);
        System.out.println("password before encoding: " + dto.getPassword());
        dto.setPassword(passwordEncoder.encode(dto.getPassword()));
        System.out.println("password after encoding: " + dto.getPassword());
        System.out.println(dto);
        userService.saveUser(dto);
        return ResponseEntity.ok("User registered successfully");
    }

}
