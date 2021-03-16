package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TodoId;

public interface TaskRegistrationService {

    public ResponseEntity<TodoId> createTask(TaskInformation taskInformation);

}
