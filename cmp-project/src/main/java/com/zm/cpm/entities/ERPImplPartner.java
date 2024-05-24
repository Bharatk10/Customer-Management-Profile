package com.zm.cpm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "erp_impl_partner", schema = "cpm")
public class ERPImplPartner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partner_id")
    private Integer partnerId;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private OrganizationProfile organizationProfile;

    @Column(name = "name")
    private String name;

    @Column(name = "impl_year")
    private Integer implementationYear;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "remarks2")
    private String remarks2;

    
}
