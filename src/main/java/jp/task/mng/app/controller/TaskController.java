package jp.task.mng.app.controller;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TaskSearchInformation;
import jp.task.mng.app.model.TodoId;
import jp.task.mng.app.service.TaskDeleteService;
import jp.task.mng.app.service.TaskRegistrationService;
import jp.task.mng.app.service.TaskSearchService;
import jp.task.mng.app.service.TaskUpateService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/todo")
public class TaskController {
    
    private final TaskUpateService updateService;
    
    private final TaskRegistrationService registService;
    
    private final TaskDeleteService deleteService;
    
    private final TaskSearchService searchService;
    
    @Autowired
    public TaskController(TaskSearchService searchService,
                           TaskRegistrationService registService,
                            TaskDeleteService deleteService,
                            TaskUpateService updateService) {
        
        this.updateService = updateService;
        this.searchService = searchService;
        this.deleteService = deleteService;
        this.registService = registService;
    }
    
    
    private static final Logger log = LoggerFactory.getLogger(TaskController.class);
    
    @GetMapping
    public ResponseEntity<List<TaskInformation>> getTask(
            @RequestParam(value = "todo_id", required = false) Integer todoId,
            @RequestParam(value = "offset", required = false) Integer offset,
            @RequestParam(value = "limit", required = false) Integer limit) {
        
        TaskSearchInformation taskSearchInfo = new TaskSearchInformation(todoId, offset, limit);
        
        return this.searchService.fetch(taskSearchInfo);
        
    }
    
    @PostMapping
    public ResponseEntity<TaskInformation> createTask(@RequestBody TaskInformation taskInformation,
                                                UriComponentsBuilder uriBuilder) {
        
        
        TodoId todoId = this.registService.createTask(taskInformation);
        URI location = todoId.getUri(uriBuilder, "/todo");
        
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(location);
        return ResponseEntity.created(location).body(taskInformation);
        

        
    }
    
    @PatchMapping("/{todo_id}")
    public ResponseEntity<Void> updateTask(
            @PathVariable("todo_id") Integer todoId,
            @RequestBody TaskInformation taskInformation) {
        
        return this.updateService.update(todoId, taskInformation);
        
    }
    
    @DeleteMapping("{todo_id}")
    public ResponseEntity<Void> deleteTask(@PathVariable("todo_id") Integer todoId) {
        
        TodoId tagetId = new TodoId(todoId);
        return this.deleteService.removeTask(tagetId);
    }
}
