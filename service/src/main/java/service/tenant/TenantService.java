package service.tenant;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.tenant.TenantRepository;
import tenant.Tenant;

@Service
@RequiredArgsConstructor
public class TenantService {

  private final TenantRepository tenantRepository;

  public void createTenant(Tenant tenant) {
    tenantRepository.save(tenant);
  }

  public Tenant getTenant(UUID id) {
    return tenantRepository.findById(String.valueOf(id)).orElseThrow();
  }

  public List<Tenant> getTenants() {
    return tenantRepository.findAll();
  }

  public void updateTenant(UUID id, Tenant tenant) {
    Tenant existingTenant = getTenant(id);
    existingTenant.setName(tenant.getName());
    existingTenant.setUpdatedAt(new Date(System.currentTimeMillis()));
    tenantRepository.save(existingTenant);
  }

  public void deleteTenant(UUID id) {
    Tenant tenant = getTenant(id);
    tenantRepository.delete(tenant);
  }

}
