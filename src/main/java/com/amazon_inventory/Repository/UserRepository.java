package com.amazon_inventory.Repository;

import com.amazon_inventory.Model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findByEmail(String email);
    boolean existsByEmail(String email);
    List<UserEntity> findByRole(String role);
    Optional<UserEntity> findByPhoneNumber(String phoneNumber);
}
