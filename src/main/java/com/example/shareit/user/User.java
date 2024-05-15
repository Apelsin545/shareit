package com.example.shareit.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private final Long id;

    @Column
    private String name;

    @Column
    private String login;
    @Column
    private String password;
}
