package com.example.coursejpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    // @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    // @JoinColumn(name = "user_id", referencedColumnName = "id")
    // private List<User> users;
    // @ManyToOne(fetch = FetchType.LAZY)
    // @ManyToOne
    // @JoinColumn(name = "user_id")
    // private User customerProductOrderClaim;
}
