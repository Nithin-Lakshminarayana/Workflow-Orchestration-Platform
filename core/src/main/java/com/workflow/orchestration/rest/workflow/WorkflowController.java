package com.workflow.orchestration.rest.workflow;

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
import service.workflow.WorkflowService;
import workflow.Workflow;

@RestController
@RequestMapping("/api/workflows")
@RequiredArgsConstructor
public class WorkflowController {

  private final WorkflowService workflowService;

  @PostMapping
  public void createWorkflow(@RequestBody Workflow workflow) {
    workflowService.createWorkflow(workflow);
  }

  @GetMapping("/{workflowId}")
  public Workflow getWorkflow(@PathVariable UUID workflowId) {
    return workflowService.getWorkflow(workflowId);
  }

  @GetMapping
  public List<Workflow> getWorkflows() {
    return workflowService.getWorkflows();
  }

  @PutMapping("/{workflowId}")
  public void updateWorkflow(@PathVariable UUID workflowId, @RequestBody Workflow workflow) {
    workflowService.updateWorkflow(workflowId, workflow);
  }

  @DeleteMapping("/{workflowId}")
  public void deleteWorkflow(@PathVariable UUID workflowId) {
    workflowService.deleteWorkflow(workflowId);
  }
}
