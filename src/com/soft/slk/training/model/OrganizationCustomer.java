package com.soft.slk.training.model;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

import com.google.common.base.Joiner;

public class OrganizationCustomer extends Customer {
	private Date formationDate;
	private String orgName;
	private String extension;
	private OrganizationType organizationType;

	public Date getFormationDate() {
		return formationDate;
	}

	public void setFormationDate(Date formationDate) {
		this.formationDate = formationDate;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public OrganizationType getOrganizationType() {
		return this.organizationType;
	}

	public void setOrganizationType(OrganizationType organizationType) {
		this.organizationType = organizationType;
	}
	
	
	@Override
	public String getName() {
		return Joiner.on(StringUtils.SPACE).skipNulls().join(this.orgName, this.extension);
	}
}
