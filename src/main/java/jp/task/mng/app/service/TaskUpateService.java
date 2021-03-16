package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;

import jp.task.mng.app.model.TaskInformation;

public interface TaskUpateService {

    ResponseEntity<Void> update(Integer todoId, TaskInformation taskInformation);

}
