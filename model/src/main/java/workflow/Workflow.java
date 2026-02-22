package workflow;

import java.util.Date;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "workflows")
public class Workflow {

  @Id
  private String id;
  private UUID tenantId;
  private String name;
  private String description;
  private Date createdAt;
  private String createdBy;
  private Date updatedAt;

  public Workflow(String id, UUID tenantId, String name, String description, Date createdAt,
      String createdBy, Date updatedAt) {
    this.id = id;
    this.tenantId = tenantId;
    this.name = name;
    this.description = description;
    this.createdAt = new Date(System.currentTimeMillis());
    this.createdBy = createdBy;
    this.updatedAt = new Date(System.currentTimeMillis());
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

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
}
