package tutorial.com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tutorial.com.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}