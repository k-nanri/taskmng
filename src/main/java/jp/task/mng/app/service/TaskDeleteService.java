package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;

import jp.task.mng.app.model.TodoId;

public interface TaskDeleteService {

    ResponseEntity<Void> removeTask(TodoId tagetId);

}
