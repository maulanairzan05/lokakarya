package com.ogya.lokakarya.wrapper.usermanagement;

import java.util.Date;


public class RolesWrapper {
	private Long roleId;
	private String nama;
	private String programName;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	

	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}//--------------------------------------------------------------------------------------------------------



	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}//--------------------------------------------------------------------------------------------------------



	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}//--------------------------------------------------------------------------------------------------------



	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	//--------------------------------------------------------------------------------------------------------


	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	//--------------------------------------------------------------------------------------------------------


	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	//--------------------------------------------------------------------------------------------------------


	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	//--------------------------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "RolesWrapper [roleId=" + roleId + ", nama=" + nama + ", programName=" + programName + ", createdDate="
				+ createdDate + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate + ", updatedBy=" + updatedBy
				+ ", getRoleId()=" + getRoleId() + ", getNama()=" + getNama() + ", getProgramName()=" + getProgramName()
				+ ", getCreatedDate()=" + getCreatedDate() + ", getCreatedBy()=" + getCreatedBy()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", getUpdatedBy()=" + getUpdatedBy() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	
}
