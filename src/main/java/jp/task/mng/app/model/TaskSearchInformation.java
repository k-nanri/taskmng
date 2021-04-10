package jp.task.mng.app.model;

public class TaskSearchInformation {
    
    private final int todoId;
    
    private final Integer offset;
    
    private final Integer limit;
    
    public TaskSearchInformation(Integer todoId, Integer offset, Integer limit) {
        
        /*
        if (isEmptyOrlessThanZero(todoId)) {
            throw new IllegalArgumentException();
        }
        
        this.todoId = todoId;
        
        if (offset != null && offset < 0) {
            throw new IllegalArgumentException();
        }
        */
        this.todoId = 0;
        
        this.offset = offset;        
        this.limit = limit;      
        
    }
    
    private boolean isEmptyOrlessThanZero(Integer number) {
        if (number == null) {
            return true;
        }
        
        boolean isResult = false;
        if (number < 0) {
            isResult = true;
        } else {
            isResult = false;
        }
        return isResult;
    }

}