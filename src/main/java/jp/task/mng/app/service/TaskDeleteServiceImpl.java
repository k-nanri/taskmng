package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;

import jp.task.mng.app.model.TodoId;

public class TaskDeleteServiceImpl implements TaskDeleteService {

    @Override
    public ResponseEntity<Void> removeTask(TodoId tagetId) {
        return null;
    }

}
