package com.zm.cpm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "turnover_range", schema = "cpm")
@Data
public class TurnoverRange {

    @Id
    @Column(name = "range_id")
    private Integer rangeId;

    @Column(name = "range")
    private String range;

    // Getters and Setters
}
