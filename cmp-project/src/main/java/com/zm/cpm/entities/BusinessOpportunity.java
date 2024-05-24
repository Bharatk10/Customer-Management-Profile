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
@Table(name = "buss_oppor", schema = "cpm")
public class BusinessOpportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "opp_id")
    private Integer opportunityId;

    @ManyToOne
    @JoinColumn(name = "org_id")
    private OrganizationProfile organizationProfile;

    @ManyToOne
    @JoinColumn(name = "tech_id")
    private SoftwareTech softwareTech;

    @Column(name = "opp_type")
    private String opportunityType;

    @Column(name = "opp_month")
    private Integer opportunityMonth;

    @Column(name = "opp_year")
    private Integer opportunityYear;

    @Column(name = "status")
    private String opportunityStatus;

    @Column(name = "tech_remarks")
    private String techRemarks;

    @Column(name = "opp_remarks")
    private String opportunityRemarks;

   
}
