package service.workflow;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.workflow.WorkflowRepository;
import workflow.Workflow;

@Service
@RequiredArgsConstructor
public class WorkflowService {

  private WorkflowRepository workflowRepository;

  public void createWorkflow(Workflow workflow) {
    workflowRepository.save(workflow);
  }

  public Workflow getWorkflow(UUID id) {
    return workflowRepository.findById(String.valueOf(id)).orElseThrow();
  }

  public List<Workflow> getWorkflows() {
    return workflowRepository.findAll();
  }

  public void updateWorkflow(UUID id, Workflow workflow) {
    Workflow existing = getWorkflow(id);
    existing.setName(workflow.getName());
    existing.setDescription(workflow.getDescription());
    existing.setUpdatedAt(new Date(System.currentTimeMillis()));
    existing.setTenantId(workflow.getTenantId());
    workflowRepository.save(workflow);
  }

  public void deleteWorkflow(UUID id) {
    Workflow workflow = getWorkflow(id);
    workflowRepository.delete(workflow);
  }

}
