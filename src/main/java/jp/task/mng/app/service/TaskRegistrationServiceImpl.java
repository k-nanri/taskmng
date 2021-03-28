package jp.task.mng.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.task.mng.app.dto.TaskRegistrationDto;
import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TodoId;
import jp.task.mng.app.repository.TaskRegistrationMapper;

@Transactional
@Service
public class TaskRegistrationServiceImpl implements TaskRegistrationService {

    private final TaskRegistrationMapper repository;
    
    @Autowired
    public TaskRegistrationServiceImpl(TaskRegistrationMapper repository) {
        this.repository = repository;
    }
    
    @Override
    public ResponseEntity<TodoId> createTask(TaskInformation taskInformation) {
        
        TaskRegistrationDto dto = taskInformation.createTaakDto();
        this.repository.createTask(dto);
        
        return null;
    }

}
