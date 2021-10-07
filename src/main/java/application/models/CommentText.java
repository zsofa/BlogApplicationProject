package application.models;

import lombok.Getter;
import lombok.Setter;

public class CommentText {

    @Getter @Setter
    private long id;
    @Getter @Setter
    private String commentContent;

    public CommentText(long id, String commentContent) {
        this.id = id;
        this.commentContent = commentContent;
    }
}
