package jp.task.mng.app.dto;

import java.time.ZonedDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TaskRegistrationDto {
    
    private String title;
    
    private String detail;
    
    private int progress;
    
    private ZonedDateTime startDate;
    
    private ZonedDateTime endDate;
    

}
