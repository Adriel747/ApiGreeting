package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/work-flow")
public class WorkFlowController {

    @Autowired
    workFlowService workflowService;

    @GetMapping()
    public List list(){
        return workflowService.obtainList();
    }

    @PostMapping()
    public void save(
            @RequestBody WorkflowDto workflowDto
    ){
        WorkFlow workFlow = new WorkFlow(
                workflowDto.name(),
                workflowDto.Description()
        );
        this.workflowService.create(
                workFlow
        );

    }

}
