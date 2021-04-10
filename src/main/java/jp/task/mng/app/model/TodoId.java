package jp.task.mng.app.model;

import java.io.Serializable;
import java.net.URI;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;

@Getter
public class TodoId implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private final int todoId;
    
    public TodoId(int todoId) {
        this.todoId = todoId;
    }

    public URI getUri(UriComponentsBuilder uriBuilder, String resource) {
        String path = resource + "/{todoId}";
        URI uri = uriBuilder.path(path).buildAndExpand(this.todoId).toUri();
        return uri;
    }
}
