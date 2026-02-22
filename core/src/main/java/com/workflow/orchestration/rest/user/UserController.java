package com.workflow.orchestration.rest.user;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.user.UserService;
import user.User;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.createUser(user);
  }

  @GetMapping("/{userId}")
  public User getUser(@PathVariable UUID userId) {
    return userService.getUser(userId);
  }

  @GetMapping
  public List<User> getAllUsers() {
    return userService.getUsers();
  }

  @PutMapping("/{userId}")
  public User updateUser(@PathVariable UUID userId, @RequestBody User user) {
    return userService.updateUser(userId, user);
  }

  @DeleteMapping
  public void deleteUser(@PathVariable UUID userId) {
    userService.deleteUser(userId);
  }
}
