package com.newsoft.users.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.newsoft.users.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByFirstNameOrLastNameOrPinCode(String firstName, String lastName, Integer pinCode);

	public List<User> findByOrderByJoinDateAsc();

	public Optional<User> findByEmailId(String username);

}
