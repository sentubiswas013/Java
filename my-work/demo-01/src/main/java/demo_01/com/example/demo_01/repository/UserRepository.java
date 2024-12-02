package demo_01.com.example.demo_01.repository;

import demo_01.com.example.demo_01.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}