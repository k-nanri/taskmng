package jp.task.mng.app.repository;

import java.util.List;

import jp.task.mng.app.model.TaskInformation;
import jp.task.mng.app.model.TaskSearchInformation;

public interface TaskSearchMapper {

    List<TaskInformation> fetch(TaskSearchInformation taskSearchInfo);

}
