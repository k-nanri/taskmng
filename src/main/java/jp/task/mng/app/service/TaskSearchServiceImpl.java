package jp.task.mng.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TaskSearchInformation;

@Service
public class TaskSearchServiceImpl implements TaskSearchService {

    @Override
    public ResponseEntity<List<TaskInformation>> fetch(TaskSearchInformation taskSearchInfo) {
        // TODO Auto-generated method stub
        return null;
    }

}
