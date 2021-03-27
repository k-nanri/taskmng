package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jp.task.mng.app.model.TodoId;

@Service
public class TaskDeleteServiceImpl implements TaskDeleteService {

    @Override
    public ResponseEntity<Void> removeTask(TodoId tagetId) {
        return null;
    }

}
