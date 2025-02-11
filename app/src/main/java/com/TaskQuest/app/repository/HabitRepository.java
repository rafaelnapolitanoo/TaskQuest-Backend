package com.TaskQuest.app.repository;

import com.TaskQuest.app.domain.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Long> {
}
