package com.zm.cpm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OrganizationDocumnetsDTO {
	private String fileName;
	private byte[] fileContent;

}
