package tenant;

import java.util.Date;
import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tenants")
public class Tenant {

  @Id
  private UUID id;
  private String name;
  private Date createdAt;
  private Date updatedAt;

  public Tenant(UUID id, String name, Date createdAt, Date updatedAt) {
    this.id = id;
    this.name = name;
    this.createdAt = new Date(System.currentTimeMillis());
    this.updatedAt = new Date(System.currentTimeMillis());
  }

  public Tenant() {
    //Default Constructor
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
}
