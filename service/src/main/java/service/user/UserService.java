package service.user;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import repository.user.UserRepository;
import user.User;

@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User createUser(User user) {
    return userRepository.save(user);
  }

  public User getUser(UUID id) {
    return userRepository.findById(String.valueOf(id)).orElseThrow();
  }

  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public User updateUser(UUID id, User user) {
    User existingUser = getUser(id);
    existingUser.setName(user.getName());
    existingUser.setTenantId(user.getTenantId());
    existingUser.setEmail(user.getEmail());
    existingUser.setPasswordHash(user.getPasswordHash());
    existingUser.setRole(user.getRole());
    existingUser.setUpdatedAt(new Date(System.currentTimeMillis()));
    return userRepository.save(user);
  }

  public void deleteUser(UUID id) {
    User user = getUser(id);
    userRepository.delete(user);
  }

}
