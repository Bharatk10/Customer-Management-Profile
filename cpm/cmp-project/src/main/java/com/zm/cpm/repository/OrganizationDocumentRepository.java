package com.zm.cpm.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zm.cpm.entities.OrganizationDocument;

public interface OrganizationDocumentRepository extends JpaRepository<OrganizationDocument, Serializable> {

}
