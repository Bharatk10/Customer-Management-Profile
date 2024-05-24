package com.zm.cpm.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "org_profile", schema = "cpm")
@Data
public class OrganizationProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "org_id")
    private Integer orgId;

    @Column(name = "legal_name", nullable = false, unique = true)
    private String legalName;

    @Column(name = "parent_name")
    private String parentName;

    @Column(name = "crm_name")
    private String crmName;

    @Column(name = "ind_sec")
    private String industrySector;

    @Column(name = "no_of_emps")
    private Integer numberOfEmployees;

    @ManyToOne
    @JoinColumn(name = "turnover_range_id")
    private TurnoverRange turnoverRangeId;

    @Column(name = "turnover_value")
    private Double turnoverValue;

    @Column(name = "org_remarks")
    private String organizationRemarks;

    @Column(name = "website")
    private String website;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "phone_1")
    private String phone1;

    @Column(name = "phone_2")
    private String phone2;

    @Column(name = "phone_3")
    private String phone3;

    @Column(name = "addr_line1")
    private String addressLine1;

    @Column(name = "addr_line2")
    private String addressLine2;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "erp_vendor")
    private String erpVendor;

    @Column(name = "erp_impl_year")
    private Integer erpImplementationYear;

    @Column(name = "erp_remarks")
    private String erpRemarks;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "created_by")
    private String createdBy;
    
    @OneToMany(mappedBy = "organizationProfile", cascade = CascadeType.ALL)
    private List<OrganizationDocument> docs;

    @OneToMany(mappedBy = "organizationProfile", cascade = CascadeType.ALL)
    private List<OrganizationContact> contacts;

    @OneToMany(mappedBy = "organizationProfile", cascade = CascadeType.ALL)
    private List<ERPImplPartner> erpImplementationPartners;

    @OneToMany(mappedBy = "organizationProfile", cascade = CascadeType.ALL)
    private List<AMSPartner> amsPartners;

    @OneToMany(mappedBy = "organizationProfile", cascade = CascadeType.ALL)
    private List<BusinessOpportunity> businessOpportunities;

    
}
