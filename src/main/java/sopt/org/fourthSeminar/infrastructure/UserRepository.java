package sopt.org.fourthSeminar.infrastructure;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.data.repository.Repository;
import sopt.org.fourthSeminar.domain.User;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {

    // CREATE
    void save(User user);

    // READ
    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findById(Long userId);

    // UPDATE

    // DELETE
}
