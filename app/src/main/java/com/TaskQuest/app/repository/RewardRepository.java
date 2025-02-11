package com.TaskQuest.app.repository;

import com.TaskQuest.app.domain.Reward;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RewardRepository extends JpaRepository<Reward, Long> {
}
