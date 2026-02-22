import org.springframework.data.mongodb.repository.MongoRepository;
import workflow.Workflow;

public interface WorkflowRepository extends MongoRepository<Workflow, String> {

}
