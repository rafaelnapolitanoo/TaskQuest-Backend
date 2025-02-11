package com.TaskQuest.app.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Habits")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Habit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private boolean isCompleted;

    @Enumerated(EnumType.STRING)
    private Difficult difficult;

    @Enumerated(EnumType.STRING)
    private Frequency frequency;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}

enum Difficult{
    EASY, MEDIUM, HARD
}

enum Frequency{
    DAILY, WEEKLY, MONTHLY
}