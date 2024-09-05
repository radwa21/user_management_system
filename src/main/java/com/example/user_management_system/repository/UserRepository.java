package com.example.user_management_system.repository;

import com.example.user_management_system.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    /**
     * Finds a user by their username.
     *
     * The method returns an Optional<User> to handle the possibility that
     * no user may be found with the given username. Using Optional helps
     * avoid null pointer exceptions and makes the absence of a user explicit.
     *
     * @param username the username of the user to find
     * @return an Optional containing the User if found, or Optional.empty() if not found
     */

}
