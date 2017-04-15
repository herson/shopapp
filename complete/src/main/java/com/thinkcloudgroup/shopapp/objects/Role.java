package com.thinkcloudgroup.shopapp.objects;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.validation.annotation.Validated;

@Validated
public class Role {
	@Id private String id;
	private String name;
	private String description;
    public Date created;
    public String createdBy;
    public Date modified;
    public String modifiedBy;

	// Getters
	public String getId() { return id; }
	public String getName() { return name; }
	public String getDescription() { return description; }
	public Date getCreated() { return created; }
	public String getCreatedBy() { return createdBy; }
	public Date getModified() { return modified; }
	public String getModifiedBy() { return modifiedBy; }

	// Setters
	public void setId(String id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setDescription(String description) { this.description = description; }
	public void setCreated(Date created) {this.created = created; }
	public void setCreatedBy(String createdBy) {this.createdBy = createdBy; }
	public void setModified(Date modified) {this.modified = modified; }
	public void setModifiedBy(String modifiedBy) {this.modifiedBy = modifiedBy; }
}
