package com.TaskQuest.app.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table( name = "Rewards")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Reward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private int xpCost; // Custo em XP para desbloquear a recompensa

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    // Getters e Setters
}
