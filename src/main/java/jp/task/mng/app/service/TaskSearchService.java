package jp.task.mng.app.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TaskSearchInformation;

public interface TaskSearchService {

    ResponseEntity<List<TaskInformation>> fetch(TaskSearchInformation taskSearchInfo);

}
