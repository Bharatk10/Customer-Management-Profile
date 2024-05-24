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
@Table(name = "org_contact", schema = "cpm")
@Data
public class OrganizationContact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Integer contactId;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private OrganizationProfile organizationProfile;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "email")
    private String email;

    @Column(name = "designation")
    private String designation;

    @Column(name = "influencer")
    private Boolean influencer;

    @Column(name = "decision_maker")
    private Boolean decisionMaker;

    @Column(name = "phone_1")
    private String phone1;

    @Column(name = "phone_2")
    private String phone2;

    @Column(name = "phone_3")
    private String phone3;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "linkedin_url")
    private String linkedinUrl;

    @Column(name = "facebook_url")
    private String facebookUrl;

    @Column(name = "link3")
    private String link3;

    @Column(name = "link4")
    private String link4;

    // Getters and Setters
}

