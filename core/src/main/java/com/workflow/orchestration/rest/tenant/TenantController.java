package com.workflow.orchestration.rest.tenant;

import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.tenant.TenantService;
import tenant.Tenant;

@RestController
@RequestMapping("/api/tenants")
@RequiredArgsConstructor
public class TenantController {

  private final TenantService tenantService;

  @PostMapping
  public void createTenant(@RequestBody Tenant tenant) {
    tenantService.createTenant(tenant);
  }

  @GetMapping("/{tenantId}")
  public Tenant getTenant(@PathVariable UUID tenantId) {
    return tenantService.getTenant(tenantId);
  }

  @GetMapping
  public List<Tenant> getAllTenants() {
    return tenantService.getTenants();
  }

  @PutMapping("/{tenantId}")
  public void updateTenant(@PathVariable UUID tenantId, @RequestBody Tenant tenant) {
    tenantService.updateTenant(tenantId, tenant);
  }

  @DeleteMapping("/{tenantId}")
  public void deleteTenant(@PathVariable UUID tenantId) {
    tenantService.deleteTenant(tenantId);
  }
}
