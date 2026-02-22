package repository.user;

import org.springframework.data.mongodb.repository.MongoRepository;
import user.User;

public interface UserRepository extends MongoRepository<User, String> {

}