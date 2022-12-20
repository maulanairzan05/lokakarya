package com.ogya.lokakarya.wrapper.usermanagement;

import java.util.Date;


public class MenuWrapper {
	private Long menuId;
	private String icon;
	private String url;
	private String programName;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	

	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	//--------------------------------------------------------------------------------------------------------



	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	//--------------------------------------------------------------------------------------------------------



	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	//--------------------------------------------------------------------------------------------------------



	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	//--------------------------------------------------------------------------------------------------------


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
		return "MenuWrapper [menuId=" + menuId + ", icon=" + icon + ", url=" + url + ", programName=" + programName
				+ ", createdDate=" + createdDate + ", createdBy=" + createdBy + ", updatedDate=" + updatedDate
				+ ", updatedBy=" + updatedBy + "]";
	}
	

	
	
	
}
