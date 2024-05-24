package com.zm.cpm.mapper;

import com.zm.cpm.dto.OrganizationProfileDTO;
import com.zm.cpm.entities.OrganizationProfile;
import com.zm.cpm.entities.TurnoverRange;

public class OrganizationProfileMapper {

    public static OrganizationProfileDTO toDTO(OrganizationProfile entity) {
        if (entity == null) {
            return null;
        }
        
        OrganizationProfileDTO dto = new OrganizationProfileDTO();
        
        dto.setOrgId(entity.getOrgId());
        dto.setLegalName(entity.getLegalName());
        dto.setParentName(entity.getParentName());
        dto.setCrmName(entity.getCrmName());
        dto.setIndustrySector(entity.getIndustrySector());
        dto.setNumberOfEmployees(entity.getNumberOfEmployees());
        dto.setTurnoverRangeId(entity.getTurnoverRangeId() != null ? entity.getTurnoverRangeId().getRangeId() : null);
        dto.setTurnoverValue(entity.getTurnoverValue());
        dto.setOrganizationRemarks(entity.getOrganizationRemarks());
        dto.setWebsite(entity.getWebsite());
        dto.setEmail(entity.getEmail());
        dto.setPhone1(entity.getPhone1());
        dto.setPhone2(entity.getPhone2());
        dto.setPhone3(entity.getPhone3());
        dto.setAddressLine1(entity.getAddressLine1());
        dto.setAddressLine2(entity.getAddressLine2());
        dto.setCountry(entity.getCountry());
        dto.setState(entity.getState());
        dto.setErpVendor(entity.getErpVendor());
        dto.setErpImplementationYear(entity.getErpImplementationYear());
        dto.setErpRemarks(entity.getErpRemarks());
        dto.setCreatedOn(entity.getCreatedOn());
        dto.setCreatedBy(entity.getCreatedBy());

        return dto;
    }
   
    
    public static OrganizationProfile toEntity(OrganizationProfileDTO dto, TurnoverRange turnoverRange) {
        if (dto == null) {
            return null;
        }
        
        OrganizationProfile entity = new OrganizationProfile();
        
        entity.setOrgId(dto.getOrgId());
        entity.setLegalName(dto.getLegalName());
        entity.setParentName(dto.getParentName());
        entity.setCrmName(dto.getCrmName());
        entity.setIndustrySector(dto.getIndustrySector());
        entity.setNumberOfEmployees(dto.getNumberOfEmployees());
        entity.setTurnoverRangeId(turnoverRange); // You need to fetch the TurnoverRange entity based on dto.getTurnoverRangeId()
        entity.setTurnoverValue(dto.getTurnoverValue());
        entity.setOrganizationRemarks(dto.getOrganizationRemarks());
        entity.setWebsite(dto.getWebsite());
        entity.setEmail(dto.getEmail());
        entity.setPhone1(dto.getPhone1());
        entity.setPhone2(dto.getPhone2());
        entity.setPhone3(dto.getPhone3());
        entity.setAddressLine1(dto.getAddressLine1());
        entity.setAddressLine2(dto.getAddressLine2());
        entity.setCountry(dto.getCountry());
        entity.setState(dto.getState());
        entity.setErpVendor(dto.getErpVendor());
        entity.setErpImplementationYear(dto.getErpImplementationYear());
        entity.setErpRemarks(dto.getErpRemarks());
        entity.setCreatedOn(dto.getCreatedOn());
        entity.setCreatedBy(dto.getCreatedBy());

        return entity;
    }
    public static OrganizationProfile toEntityWithOrgDetails(OrganizationProfileDTO dto, TurnoverRange turnoverRange,OrganizationProfile entity) {
    	if (dto == null) {
    		return null;
    	}
    	
    	//OrganizationProfile entity = new OrganizationProfile();
    	
    	
    	entity.setLegalName(dto.getLegalName());
    	entity.setParentName(dto.getParentName());
    	entity.setCrmName(dto.getCrmName());
    	entity.setIndustrySector(dto.getIndustrySector());
    	entity.setNumberOfEmployees(dto.getNumberOfEmployees());
    	entity.setTurnoverRangeId(turnoverRange); // You need to fetch the TurnoverRange entity based on dto.getTurnoverRangeId()
    	entity.setTurnoverValue(dto.getTurnoverValue());
    	entity.setOrganizationRemarks(dto.getOrganizationRemarks());
    	entity.setWebsite(dto.getWebsite());
    	entity.setEmail(dto.getEmail());
    	entity.setPhone1(dto.getPhone1());
    	entity.setPhone2(dto.getPhone2());
    	entity.setPhone3(dto.getPhone3());
    	entity.setAddressLine1(dto.getAddressLine1());
    	entity.setAddressLine2(dto.getAddressLine2());
    	entity.setCountry(dto.getCountry());
    	entity.setState(dto.getState());
    	entity.setErpVendor(dto.getErpVendor());
    	entity.setErpImplementationYear(dto.getErpImplementationYear());
    	entity.setErpRemarks(dto.getErpRemarks());
    	entity.setCreatedOn(dto.getCreatedOn());
    	entity.setCreatedBy(dto.getCreatedBy());
    	
    	return entity;
    }
}
