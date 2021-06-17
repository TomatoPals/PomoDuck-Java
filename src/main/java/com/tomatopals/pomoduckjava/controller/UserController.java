package com.tomatopals.pomoduckjava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tomatopals.pomoduckjava.entity.User;
import com.tomatopals.pomoduckjava.exception.ResourceNotFoundException;
import com.tomatopals.pomoduckjava.repository.UserRepository;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    // get all users
    @GetMapping
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    // get user by id
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") long userId) {
        return this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
    }

    // create user
    @PostMapping
    public User createUser(@RequestBody User user) {
        return this.userRepository.save(user);
    }

    // update user
    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") long userId) {
        User existingUser = this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setUserPassword(user.getUserPasssword());
        existingUser.setCountry(user.getCountry());
        existingUser.setAlias(user.getAlias());
        existingUser.setAliasImage(user.getAliasImage());
        existingUser.setDisplayPref(user.getDisplayPref());
        existingUser.setTotalPomSeconds(user.getTotalPomSeconds());
        existingUser.setTotalSmallBreakSeconds(user.getTotalSmallBreakSeconds());
        existingUser.setTotalBigBreakSeconds(user.getTotalBigBreakSeconds());
        existingUser.setPomTime(user.getPomTime());
        existingUser.setSmallBreakTime(user.getSmallBreakTime());
        existingUser.setBigBreakTime(user.getBigBreakTime());
        return this.userRepository.save(existingUser);
    }

    // delete user by id
    @DeleteMapping("/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable("id") long userId) {
        User existingUser = this.userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id :" + userId));
        this.userRepository.delete(existingUser);
        return ResponseEntity.ok().build();
    }
}
