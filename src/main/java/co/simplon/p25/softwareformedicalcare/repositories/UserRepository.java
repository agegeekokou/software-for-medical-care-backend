package co.simplon.p25.softwareformedicalcare.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.simplon.p25.softwareformedicalcare.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByUsernameIgnoreCase(String username);
}
