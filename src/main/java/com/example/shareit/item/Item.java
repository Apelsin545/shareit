package com.example.shareit.item;

import com.example.shareit.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Entity
@Table
public class Item {
    @Id
    @GeneratedValue
    private final long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column
    private String name;

    @Column
    private String description;

    @Enumerated(EnumType.STRING)
    private AccessStatus status;
}
