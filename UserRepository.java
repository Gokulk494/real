// src/main/java/eight/repository/UserRepository.java

package eight.repository;

import eight.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
