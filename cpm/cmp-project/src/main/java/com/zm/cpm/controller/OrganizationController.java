package com.zm.cpm.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zm.cpm.dto.OrganizationDocumnetsDTO;
import com.zm.cpm.dto.OrganizationProfileDTO;
import com.zm.cpm.service.OrganizationServiceImpl;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/cpm/org-profile")
@AllArgsConstructor
public class OrganizationController {
	private OrganizationServiceImpl organizationService;
	
	
	@PostMapping("/create")
	public ResponseEntity<String> createorganization(@RequestBody OrganizationProfileDTO orgProfDto){
		organizationService.createOrg(orgProfDto);
		return ResponseEntity.status(HttpStatus.CREATED).body("Organization successfully created");
	}
	
	@PutMapping("/{id}/update")
	public ResponseEntity<String> updateorganization(@RequestBody OrganizationProfileDTO orgProfDto,@PathVariable Integer id){
		organizationService.updateOrg(orgProfDto, id);
		return ResponseEntity.status(HttpStatus.CREATED).body("Organization successfully created");
	}

	@PostMapping("/{orgId}/upload")
	public ResponseEntity<String> saveorgDoc(@RequestParam MultipartFile file, @PathVariable Integer orgId){
		System.err.println(orgId);
		organizationService.saveOrgDocuments(file, orgId);
		return ResponseEntity.status(HttpStatus.CREATED).body("Organization Documents Uploaded successfully ");
	}
	
	@GetMapping("/{orgId}/documents")
	public ResponseEntity<List<OrganizationDocumnetsDTO>> getAllDocuments(@PathVariable Integer orgId) {
		return ResponseEntity.status(HttpStatus.OK).body(organizationService.getAllFiles(orgId));
	}
	
	@GetMapping("/{orgId}")
	public ResponseEntity<OrganizationProfileDTO> getOrganization(@PathVariable Integer orgId) {
		return ResponseEntity.status(HttpStatus.OK).body(organizationService.getOrganization(orgId));
	}
	
	
	
}
