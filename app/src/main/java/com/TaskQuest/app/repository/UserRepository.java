package com.TaskQuest.app.repository;

import com.TaskQuest.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
