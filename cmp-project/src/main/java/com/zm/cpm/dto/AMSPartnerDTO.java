package com.zm.cpm.dto;

import com.zm.cpm.entities.OrganizationProfile;


import lombok.Data;

@Data
public class AMSPartnerDTO {
	private Integer partnerId;

   
    private OrganizationProfile organizationProfile;

    private String name;

    private Integer expiryMonth;

    private Integer expiryYear;

    
    private String remarks;

   
    private String remarks2;

}
