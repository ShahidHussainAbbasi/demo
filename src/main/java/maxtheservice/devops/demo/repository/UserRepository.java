package maxtheservice.devops.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import maxtheservice.devops.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
