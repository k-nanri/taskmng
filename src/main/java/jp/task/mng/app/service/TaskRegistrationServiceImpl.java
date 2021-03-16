package jp.task.mng.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import jp.task.mng.app.dto.TaskRegistrationDto;
import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TodoId;
import jp.task.mng.app.repository.TaskRegistrationRepository;

public class TaskRegistrationServiceImpl implements TaskRegistrationService {

    private final TaskRegistrationRepository repository;
    
    @Autowired
    public TaskRegistrationServiceImpl(TaskRegistrationRepository repository) {
        this.repository = repository;
    }
    
    @Override
    public ResponseEntity<TodoId> createTask(TaskInformation taskInformation) {
        
        TaskRegistrationDto dto = taskInformation.createTaakDto();
        this.repository.createTask(dto);
        
        return null;
    }

}
