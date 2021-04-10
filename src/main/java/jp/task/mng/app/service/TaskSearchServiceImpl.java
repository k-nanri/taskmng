package jp.task.mng.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TaskSearchInformation;
import jp.task.mng.app.repository.TaskSearchMapper;

@Service
public class TaskSearchServiceImpl implements TaskSearchService {
    
    private final TaskSearchMapper mappter;
    
    @Autowired
    public TaskSearchServiceImpl(TaskSearchMapper mappter) {
        this.mappter = mappter;
    }

    @Override
    public List<TaskInformation> fetch(TaskSearchInformation taskSearchInfo) {
        
        return this.mappter.fetch(taskSearchInfo);
    }

}
