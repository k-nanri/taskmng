package jp.task.mng.app.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jp.task.mng.app.dto.TaskRegistrationDto;
import lombok.Data;

@Data
public class TaskInformation implements Serializable {
    

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    @JsonProperty("taskId")
    private int id;

    @JsonProperty("title")
    private String title;
    
    @JsonProperty("detail")
    private String detail;
    
    @JsonProperty("progress")
    private int progress;
    
    @JsonProperty("start_date")
    private LocalDateTime starttime;
    
    @JsonProperty("end_date")
    private LocalDateTime endtime;

    public TaskRegistrationDto createTaakDto() {

        return new TaskRegistrationDto(
                this.title, this.detail, this.progress, this.starttime, this.endtime);
    }

}
