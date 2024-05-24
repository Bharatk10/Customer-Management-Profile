package com.zm.cpm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "ams_partner", schema = "cpm")
@Data
public class AMSPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_id")
    private Integer partnerId;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private OrganizationProfile organizationProfile;

    @Column(name = "name")
    private String name;

    @Column(name = "exp_month")
    private Integer expiryMonth;

    @Column(name = "exp_year")
    private Integer expiryYear;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "remarks2")
    private String remarks2;

    // Getters and Setters
}
