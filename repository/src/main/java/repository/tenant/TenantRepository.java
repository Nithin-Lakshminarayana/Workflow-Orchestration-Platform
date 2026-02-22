package repository.tenant;

import org.springframework.data.mongodb.repository.MongoRepository;
import tenant.Tenant;

public interface TenantRepository extends MongoRepository<Tenant, String> {

}