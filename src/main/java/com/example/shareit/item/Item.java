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
@Table(name = "items", schema = "public")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private final Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column(name = "item_name")
    private String name;

    @Column(name = "item_description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "access_status")
    private AccessStatus status;


}
