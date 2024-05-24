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
@Table(name = "org_profile_doc", schema = "cpm")
@Data
public class OrganizationDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_id")
    private Integer docId;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private OrganizationProfile organizationProfile;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "doc_desc", nullable = false)
    private String docDescription;

    // Getters and Setters
}

