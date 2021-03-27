package jp.task.mng.app.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jp.task.mng.app.model.TaskInformation;

@Service
public class TaskUpdateServiceImpl implements TaskUpateService {

    @Override
    public ResponseEntity<Void> update(Integer todoId, TaskInformation taskInformation) {
        // TODO Auto-generated method stub
        return null;
    }

}
