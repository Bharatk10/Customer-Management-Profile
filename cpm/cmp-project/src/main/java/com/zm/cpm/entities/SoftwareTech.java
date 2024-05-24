package com.zm.cpm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "sw_tech", schema = "cpm")
@Data
public class SoftwareTech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tech_id")
    private Integer techId;

    @Column(name = "tech_name", nullable = false)
    private String techName;

    @Column(name = "tech_desc")
    private String techDesc;

    // Getters and Setters
}
