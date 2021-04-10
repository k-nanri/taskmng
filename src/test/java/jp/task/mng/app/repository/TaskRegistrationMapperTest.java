package jp.task.mng.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import jp.task.mng.app.dto.TaskRegistrationDto;

// @SpringBootTest だけだと
// The dependencies of some of the beans in the application context form a cycle
// が発生してしまう
// spring.h2.console.enabledも必要
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class TaskRegistrationMapperTest {

    @Autowired
    private TaskRegistrationMapper testTarget;
    
    @Test
    void testCreateTask() {
        
        String title = "testTitle";
        String detail = "testDetail";
        int progress = 10;
        LocalDateTime startDate = LocalDateTime.of(2021, 12, 31, 15, 30);
        LocalDateTime endDate = LocalDateTime.of(2021, 12, 31, 15, 30);
        TaskRegistrationDto dto = new TaskRegistrationDto(title, detail, progress, startDate, endDate);
        testTarget.createTask(dto);
    }

}
