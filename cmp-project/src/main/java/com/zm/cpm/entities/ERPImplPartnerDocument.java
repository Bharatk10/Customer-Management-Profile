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
@Table(name = "erp_impl_partner_doc", schema = "cpm")
public class ERPImplPartnerDocument {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_id")
    private Integer docId;

    @ManyToOne
    @JoinColumn(name = "partner_id")
    private ERPImplPartner erpImplPartner;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "doc_desc", nullable = false)
    private String docDescription;

    // Getters and Setters
}
