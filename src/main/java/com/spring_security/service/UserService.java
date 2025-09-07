package com.spring_security.service;

import com.spring_security.dto.UserDto;
import com.spring_security.entity.User;
import com.spring_security.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;
    public void saveUser(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        repo.save(user);
    }
}
