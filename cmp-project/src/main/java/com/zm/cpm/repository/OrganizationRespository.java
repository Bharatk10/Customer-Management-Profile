package com.zm.cpm.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zm.cpm.entities.OrganizationProfile;

public interface OrganizationRespository extends JpaRepository<OrganizationProfile, Serializable> {
	
	List<OrganizationProfile> findByLegalNameOrEmail(String legalName,String email);

}
