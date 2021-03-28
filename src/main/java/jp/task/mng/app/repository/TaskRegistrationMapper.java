package jp.task.mng.app.repository;


import jp.task.mng.app.dto.TaskRegistrationDto;

public interface TaskRegistrationMapper {

    void createTask(TaskRegistrationDto dto);

}
