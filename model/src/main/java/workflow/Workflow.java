package workflow;

import java.util.UUID;

public class Workflow {

  private String id;
  private UUID tenantId;
  private String name;
  private String description;
  private String createdAt;
  private String createdBy;

  public Workflow(String id, UUID tenantId, String name, String description, String createdAt,
      String createdBy) {
    this.id = id;
    this.tenantId = tenantId;
    this.name = name;
    this.description = description;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
  }

  public Workflow() {
    // Default Constructor
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UUID getTenantId() {
    return tenantId;
  }

  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
}
